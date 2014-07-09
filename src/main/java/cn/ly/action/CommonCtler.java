package cn.ly.action;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ch.qos.logback.classic.Logger;
import cn.ly.pojo.PFDept;
import cn.ly.pojo.PFEvaluage;
import cn.ly.pojo.PFGrade;
import cn.ly.pojo.PFUser;
import cn.ly.pojo.ViewGrade;
import cn.ly.service.i.ArcService;
import cn.ly.util.GlobalFinalAttr;

@Controller
public class CommonCtler {
	/**
	 * 主页跳转 index.jsp
	 */
	@RequestMapping(value={"/index.html","/" , "/page/againlogin"})
	public String gotoIndex( HttpServletRequest request) {
		PFUser user = (PFUser) request.getSession(true).getAttribute(GlobalFinalAttr.SESSION_USER );
		PFDept dept = (PFDept) request.getSession(true).getAttribute(GlobalFinalAttr.SESSION_DEPT );
		if(user !=  null && dept != null){
			return "redirect:goto2Button";
		}else{
			return "index.jsp";
		}
	}
	//-------------------------------------------------
	/**
	 * login
	 */
	@RequestMapping(value="/login" , method = RequestMethod.POST)
	public ModelAndView login(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response,
			@RequestParam("usercode") String usercode, @RequestParam("passwd") String passwd) {
		if(StringUtils.isNotEmpty(usercode) && StringUtils.isNotEmpty(passwd)){
			PFUser user = arcServcieImpl.getSingleUserCode(usercode);
			if(user != null && user.getUpassword().equals(passwd)){
				PFDept dept = arcServcieImpl.getDeptByDid(user.getPid());
				request.getSession(true).setAttribute(GlobalFinalAttr.SESSION_USER , user);
				request.getSession(true).setAttribute(GlobalFinalAttr.SESSION_DEPT , dept);
				//取 2个数 1打过 2没打过的.
				ModelAndView mvv = new ModelAndView();
				mvv.setViewName("redirect:goto2Button");
				return mvv;
			}else{
				return new ModelAndView("againlogin", "returnMsg", "用户名/密码错误");
			}
		}else{
			return new ModelAndView("againlogin", "returnMsg", "登录失败");
		}
	}
	/**
	 * 去修改密码页面
	 */
	@RequestMapping(value="/updatePassword" , method = RequestMethod.GET)
	public ModelAndView updatePassword(ModelMap modelMap, HttpServletRequest request) {
		PFUser user = (PFUser) request.getSession(true).getAttribute(GlobalFinalAttr.SESSION_USER );
		if(user !=  null){
			ModelAndView mvv = new ModelAndView();
			mvv.addObject("user", user);
			mvv.setViewName("updatePassword.jsp");
			return mvv;
		}else{
			return new ModelAndView("againlogin", "returnMsg", "连接失效请重新登录");
		}
	}
	/**
	 * 确认修改密码
	 */
	@RequestMapping(value="/submitPasword" , method = RequestMethod.POST)
	public ModelAndView submitPasword(ModelMap modelMap, HttpServletRequest request 
			, @RequestParam("oldps") String oldps , @RequestParam("newps1") String newps1 , @RequestParam("newps2") String newps2) {
		PFUser user = (PFUser) request.getSession(true).getAttribute(GlobalFinalAttr.SESSION_USER );
		if(user !=  null){
			ModelAndView mvv = new ModelAndView();
			if(!oldps.equals(user.getUpassword())){
				mvv.addObject("returnMsg", "您输入的老密码不正确,修改失败");
			}else{
				user.setUpassword(newps1);
				if(arcServcieImpl.updateUser(user)){
					request.getSession(true).setAttribute(GlobalFinalAttr.SESSION_USER , user);
				}
				mvv.addObject("returnMsg", "修改密码成功!");
			}
			mvv.addObject("user", user);
			mvv.setViewName("updatePassword.jsp");
			return mvv;
		}else{
			return new ModelAndView("againlogin", "returnMsg", "连接失效请重新登录");
		}
	}
	/**
	 * logon
	 */
	@RequestMapping(value="/logon" , method = RequestMethod.GET)
	public String logon(ModelMap modelMap, HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		if(null != request && null != session){
			session.removeAttribute(GlobalFinalAttr.SESSION_USER);
			session.removeAttribute(GlobalFinalAttr.SESSION_DEPT);
			session.invalidate();
		}
		return "index.jsp";
	}
	/**
	 * login --> redirect 2button
	 */
	@RequestMapping(value="/goto2Button" , method = RequestMethod.GET)
	public ModelAndView goto2Button(ModelMap modelMap, HttpServletRequest request) {
		PFUser user = (PFUser) request.getSession(true).getAttribute(GlobalFinalAttr.SESSION_USER );
		PFDept dept = (PFDept) request.getSession(true).getAttribute(GlobalFinalAttr.SESSION_DEPT );
		if(user !=  null && dept != null){
			File[] listFile = new File(logHomeAdd).listFiles();
			request.getSession(true).setAttribute(GlobalFinalAttr.SESSION_USER , user);
			request.getSession(true).setAttribute(GlobalFinalAttr.SESSION_DEPT , dept);
			//如果领导直接到查看所有人分数的页面
			if(getLeader().contains(user.getUusercode())){
				return new ModelAndView("forward: /leadViewGrade");
			}
			
			//取 2个数 1打过 2没打过的.
			ModelAndView mvv = new ModelAndView();
			mvv.addObject("listFile", listFile);
			mvv.addObject("currntUserCode", user.getUusercode());
			mvv.addObject("haspfnum", arcServcieImpl.getHasPfNum(user));
			mvv.addObject("want2pfTotalNum", arcServcieImpl.getADeptUserNum(dept.getBmflag() , user));
			mvv.setViewName("2button.jsp");
			return mvv;
		}else{
			return new ModelAndView("/index.jsp", "returnMsg", "连接失效请重新登录");
		}
	}
	
	/**
	 * <p>Title: 查看已经评分过的</p>
	*/
	@RequestMapping(value="viewHasPF", method = RequestMethod.GET)
	public ModelAndView viewHasPf(HttpServletRequest request){
		PFUser user = (PFUser) request.getSession().getAttribute(GlobalFinalAttr.SESSION_USER);
		ModelAndView mvv = new ModelAndView();
		mvv.addObject("hasBePfUserList" , arcServcieImpl.getHasBePfList(user));
		mvv.setViewName("hasBePfUserList.jsp");
		return mvv;
	}
	/**
	 * <p>Title: 查看已经评分过的详细</p>
	 */
	@RequestMapping(value="gotoViewHasBeDetail", method = RequestMethod.GET)
	public ModelAndView gotoViewHasBeDetail(HttpServletRequest request , @RequestParam("boperusercode") String boperusercode
			, @RequestParam("totalCount") String totalCount){
		PFUser user = (PFUser) request.getSession().getAttribute(GlobalFinalAttr.SESSION_USER);
		ModelAndView mvv = new ModelAndView();
		mvv.addObject("beoperuser" , arcServcieImpl.getSingleUserCode(boperusercode));
		mvv.addObject("hasBePfDetail" , arcServcieImpl.getBePfDetail(boperusercode, user.getUusercode(), quarter));
		mvv.addObject("totalCount" , totalCount);
		mvv.setViewName("hasBeDetailPfUserList.jsp");
		return mvv;
	}
	/**
	 * <p>Title: 查看没有评分的</p>
	 * @date 2014年2月26日
	*/
	@RequestMapping(value="viewWant2PF")
	public ModelAndView viewWant2PF(HttpServletRequest request){
		PFUser user = (PFUser) request.getSession().getAttribute(GlobalFinalAttr.SESSION_USER);
		PFDept dept = (PFDept) request.getSession().getAttribute(GlobalFinalAttr.SESSION_DEPT);;
		ModelAndView mvv = new ModelAndView();
		mvv.addObject("noBePfUserList" , arcServcieImpl.getNoBePfList(user, dept));
		mvv.setViewName("noBePfUserList.jsp");
		return mvv;
	}
	/**
	 * <p>Title: ROOT 查看所有用户的总成绩</p>
	 * @date 2014年2月26日
	 */
	@RequestMapping(value="viewAllGrade")
	public ModelAndView viewAllGrade(HttpServletRequest request){
		ModelAndView mvv = null;
		PFUser user = (PFUser) request.getSession().getAttribute(GlobalFinalAttr.SESSION_USER);
		if(null == user){
			mvv = new ModelAndView("againlogin", "returnMsg", "连接失效请重新登录");
		}else{
			mvv = new ModelAndView();
			List<ViewGrade> pfGradList = null;
			if(user.getUusercode().toUpperCase().equals("ROOT")){
				pfGradList = arcServcieImpl.getTotalGrade();
			}else{//如果不是bug这个页面是进不了 else的
				pfGradList = new ArrayList<ViewGrade>();
			}
			mvv.addObject("totalGradeList" , pfGradList);
			mvv.setViewName("totalGradeList.jsp");
			mvv.addObject("kaoheqi" , kaoHeQi);//考核期
		}
		return mvv;
	}
	/**
	 * <p>Title: ROOT 领导查看所有用户的总成绩</p>
	 * @date 2014年2月26日
	 */
	@RequestMapping(value="leadViewGrade")
	public ModelAndView leadViewGrade(HttpServletRequest request){
		ModelAndView mvv = null;
		PFUser user = (PFUser) request.getSession().getAttribute(GlobalFinalAttr.SESSION_USER);
		if(null == user){
			mvv = new ModelAndView("againlogin", "returnMsg", "连接失效请重新登录");
		}else{
			mvv = new ModelAndView();
			List<ViewGrade> pfGradList = null;
			if(getLeader().contains(user.getUusercode())){
				pfGradList = arcServcieImpl.getTotalGrade();
			}else{//如果不是bug这个页面是进不了 else的
				pfGradList = new ArrayList<ViewGrade>();
			}
			mvv.addObject("totalGradeList" , pfGradList);
			mvv.setViewName("totalGradeList4Lead.jsp");
			mvv.addObject("kaoheqi" , kaoHeQi);//考核期
		}
		return mvv;
	}
	
	/**
	 * <p>Title: 跳转到评分页面</p>
	*/
	@RequestMapping(value="gotoPf")
	public ModelAndView gotoPfPage(HttpServletRequest request , @RequestParam("bePfUserCode") String bePfUserCode ){
		PFUser user = (PFUser) request.getSession().getAttribute(GlobalFinalAttr.SESSION_USER);
		PFUser buser = arcServcieImpl.getSingleUserCode(bePfUserCode);
		PFDept bdept = arcServcieImpl.getDeptByDid(buser.getPid());
		ModelAndView mvv = new ModelAndView();
		mvv.addObject("operuser" , user);
		mvv.addObject("boperuser" , buser);
		mvv.addObject("boperuserdept" , bdept);
		mvv.addObject("kaoheqi" , kaoHeQi);//考核期
		mvv.setViewName("dafeng.jsp");
		return mvv;
	}
	
	/**
	 * <p>Title: 保存评分</p>
	 */
	@RequestMapping(value="savePf" , method = RequestMethod.POST)
	public String savePf(HttpServletRequest request , @RequestParam("bPfUserDid") Integer bPfUserDid
			, @RequestParam("grade") Float grade ,@RequestParam("pfDetail") String pfDetail ,  Model model){
		if(grade == null || grade.equals(0.0f) || StringUtils.isEmpty(pfDetail)){
			model.addAttribute( "returnMsg",  "保存失败,打分为空.");
			return  "forward:/viewWant2PF";
		}else{
			Map<String,String> evaluateMap = new LinkedHashMap<String, String>();
			try {
				evaluateMap = new ObjectMapper().readValue(pfDetail, evaluateMap.getClass());
			} catch (Exception e) {
				log.error(e.getMessage());
			}
			PFUser user = (PFUser) request.getSession().getAttribute(GlobalFinalAttr.SESSION_USER);
			PFUser buser = arcServcieImpl.getSingleUserDid(bPfUserDid);
			PFGrade pfGrade = new PFGrade();
			pfGrade.setBoperusercode(buser.getUusercode());
			pfGrade.setBoperuserdid(buser.getDid());
			pfGrade.setBoperusername(buser.getUusername());
			pfGrade.setOperusercode(user.getUusercode());
			pfGrade.setOperuserdid(user.getDid());
			pfGrade.setOperusername(user.getUusername());
			pfGrade.setOpertiime(new Date());
			pfGrade.setOperquarter(quarter);
			pfGrade.setTaccount(grade);
			pfGrade.setIsok((byte)1);
			Integer insertResult = arcServcieImpl.saveGrade(pfGrade);
			System.out.println(pfGrade.getDid());
			model.addAttribute( "returnMsg", "保存成功");
			
			if(null != evaluateMap && insertResult.equals(1)){
				Set<String> keySet = evaluateMap.keySet();
				for (String key : keySet) {
					PFEvaluage evl = new PFEvaluage();
					evl.setPid(pfGrade.getDid());
					evl.setThemean(getExamItemMap().get(key.toString()));
					evl.setThecount(Float.parseFloat(evaluateMap.get(key)));
					arcServcieImpl.insertPfEvaluate(evl);
				}
				
			}
			return  "forward:/viewWant2PF";
		}
	}
	
	@RequestMapping(value = "/getXlsFile", method = RequestMethod.GET)
	public void getXlsFile(HttpServletRequest request , HttpServletResponse response) {
		PFUser user = (PFUser) request.getSession().getAttribute(GlobalFinalAttr.SESSION_USER);
		ModelAndView mvv = new ModelAndView();
		List<ViewGrade> pfGradList = null;
		if(user.getUusercode().equals("ROOT") || getLeader().contains(user.getUusercode())){
			pfGradList = arcServcieImpl.getTotalGrade();
		}else{//如果不是bug这个页面是进不了 else的
			pfGradList = new ArrayList<ViewGrade>();
		}
		try {
			// 清空response  
			response.reset();  
			// 设置response的Header  
			response.addHeader("Content-Disposition", "attachment;filename=Shit.xls");  
			OutputStream out = new BufferedOutputStream(response.getOutputStream()); 
			response.setContentType("application/octet-stream"); 
			
			HSSFWorkbook wb = new HSSFWorkbook(); 
	        //创建第一个sheet（页）
	        Sheet sheet = wb.createSheet("所有员工成绩"); 
	        
	        int rowNum = 0;
	        int cellNum = 0;
	        
	        Row row = sheet.createRow(rowNum++); 
	        row.createCell(cellNum++).setCellValue("部门");
	        row.createCell(cellNum++).setCellValue("姓名");
	        row.createCell(cellNum++).setCellValue("正职人数");
	        row.createCell(cellNum++).setCellValue("正职总分");
	        row.createCell(cellNum++).setCellValue("副职人数");
	        row.createCell(cellNum++).setCellValue("副职平均分");
	        row.createCell(cellNum++).setCellValue("副职总分");
	        row.createCell(cellNum++).setCellValue("内设部门管理人员人数");
	        row.createCell(cellNum++).setCellValue("内设部门管理人员总分");
	        row.createCell(cellNum++).setCellValue("普通人员人数");
	        row.createCell(cellNum++).setCellValue("普通人员平均分");
	        row.createCell(cellNum++).setCellValue("普通人员总分");
	        row.createCell(cellNum++).setCellValue("所有人人数");
	        row.createCell(cellNum++).setCellValue("所有人平均分");
	        row.createCell(cellNum++).setCellValue("所有人总分");        
	        for (ViewGrade vg : pfGradList) {
	        	cellNum = 0;
	        	row = sheet.createRow(rowNum++); 
				row.createCell(cellNum++).setCellValue(vg.getBeOperUserDepName());
				row.createCell(cellNum++).setCellValue(vg.getBoperusername());
				row.createCell(cellNum++).setCellValue(vg.getZzPersons());
				row.createCell(cellNum++).setCellValue(vg.getZzCount());
				   
				row.createCell(cellNum++).setCellValue(vg.getFzPersons());
				row.createCell(cellNum++).setCellValue(vg.getFzAverage());
				row.createCell(cellNum++).setCellValue(vg.getFzCount());
				
				row.createCell(cellNum++).setCellValue(vg.getZsbmMgrPersons());
				row.createCell(cellNum++).setCellValue(vg.getZsbmMgrCount());
				   
				row.createCell(cellNum++).setCellValue(vg.getPtryPersons());
				row.createCell(cellNum++).setCellValue(vg.getPtryAverage());
				row.createCell(cellNum++).setCellValue(vg.getPtryCount());
				   
				row.createCell(cellNum++).setCellValue(vg.getTotalPersons());
				row.createCell(cellNum++).setCellValue(vg.getTotalAverage());
				row.createCell(cellNum++).setCellValue(vg.getTotalCount());       
			}
	        wb.write(out);  
	        out.flush();  
	        out.close();
		} catch (Exception e) {
			log.error("电子文件名错误:" + e.getMessage());
		}
	}
	//-------------------------------------------------
	
	/**
	 * 列出所有日志 
	 */
	@RequestMapping(value="/viewLogList")
	public ModelAndView viewLogList() {
		try {
			File[] listFile = new File(logHomeAdd).listFiles();
			return new ModelAndView("listLog.jsp", "listFile", listFile);
		} catch (Exception e) {
			log.error("获取日志列表错误." , e);
			return null;
		}
	} 
	
	/**
	 * 查看日志
	 */
	@RequestMapping("/viewLog")
	public void viewLog(HttpServletRequest request , HttpServletResponse response) {
		PrintWriter out = null;
		try {
			response.setContentType( "text/html;charset=GBK "); 
			out = response.getWriter();
			out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
			out.println("<HTML>");
			out.println("<BODY>");
			String filePath = request.getParameter("logFilePath");
			if(StringUtils.isEmpty(filePath)){
				out.print("获取日志错误!");
			}else{
				filePath = new String(filePath.getBytes("ISO-8859-1") , "UTF-8");
				File tempFile = new File(logHomeAdd+File.separatorChar+filePath);
				if(null != tempFile){
					List<String> stList = FileUtils.readLines(tempFile);
					for (String str : stList) {
						out.println(str+"<br/>");
					}
				}else{
					out.print("获取日志错误!");
				}
			}
			out.println("</BODY>");
			out.println("</HTML>");
		} catch (Exception e) {
			out.println("读取日志错误"+ e.getMessage());
			log.error("读取日志错误"+ e.getMessage());
		}finally{
			out.flush();
			out.close();
		}
	}

	/**
	 * 列出所有用户 测试方法
	 */
	@RequestMapping(value="/getUsers" , method = RequestMethod.GET)
	public String userList(Model model){
		model.addAttribute("userlist", arcServcieImpl.listAllUser());
		return "userlist.jsp";
	}
	
	/**
	 * login
	 */
	@RequestMapping(value="/changeGrade" , method = RequestMethod.GET)
	public void changeGrade(HttpServletResponse response, @RequestParam("did") Integer did ,@RequestParam("updateVal") Float updateVal) {
		Float result = arcServcieImpl.updateEvaluage(did , updateVal);
		PrintWriter out = null;
		try {
			response.setContentType("text/plain");  
			out = response.getWriter();
			out.write(result != null ? result.toString() : "");
			out.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private  Map<String , String> getExamItemMap(){
		if(examItemMap == null){
			examItemMap = arcServcieImpl.getMapBySqlReturnIntStr("select did,itemname from pf_examitem" , "did" , "itemname");
		}
		return examItemMap;
	}
	
	private List<String> getLeader(){
		if(leanders == null){
			leanders = Arrays.asList(leaderUserCodes.split("[,]"));
		}
		return leanders;
	}
	
	@Autowired
	private ArcService arcServcieImpl;
	//日志地址
	@Autowired
	@Value("${interface.log.home.address}")
	private String logHomeAdd;
	//当前季度
	@Autowired
	@Value("${pf.opert.quarter}")
	private Byte quarter;
	@Autowired
	@Value("${pf.opert.quarter.ch}")
	private String kaoHeQi;
	
	/** 领导str*/
	@Autowired
	@Value("${redirect.leader.codes}")
	private String leaderUserCodes;
	
	private List<String> leanders;
	
	private static Map<String , String> examItemMap = null;
	private Logger log =  (Logger) LoggerFactory.getLogger(this.getClass());
}
