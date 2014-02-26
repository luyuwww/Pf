package cn.ly.action;

import java.io.File;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;
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
import cn.ly.pojo.PFUser;
import cn.ly.service.i.ArcService;
import cn.ly.util.GlobalFinalAttr;

@Controller
public class CommonCtler {
	/**
	 * 主页跳转
	 */
	@RequestMapping(value={"/index.html","/" , "/page/againlogin"})
	public String gotoIndex() {
		return "index.jsp";
	}
	//-------------------------------------------------
	/**
	 * login
	 */
	@RequestMapping(value="/login" , method = RequestMethod.POST)
	public ModelAndView login(ModelMap modelMap, HttpServletRequest request, HttpServletResponse response,
			@RequestParam("usercode") String usercode, @RequestParam("passwd") String passwd) {
		if(StringUtils.isNotEmpty(usercode) && StringUtils.isNotEmpty(passwd)){
			PFUser user = arcServcieImpl.getSingleUser(usercode);
			if(user != null && user.getUpassword().equals(passwd)){
				PFDept dept = arcServcieImpl.getDeptByDid(user.getPid());
				File[] listFile = new File(logHomeAdd).listFiles();
				request.getSession(true).setAttribute(GlobalFinalAttr.SESSION_USER , user);
				request.getSession(true).setAttribute(GlobalFinalAttr.SESSION_DEPT , dept);
				//取 2个数 1打过 2没打过的.
				ModelAndView mvv = new ModelAndView();
				mvv.addObject("listFile", listFile);
				mvv.addObject("haspfnum", arcServcieImpl.getHasPfNum(user));
				mvv.addObject("want2pfTotalNum", arcServcieImpl.getADeptUserNum(dept.getBmflag() , user));
				mvv.setViewName("2button.jsp");
				return mvv;
			}else{
				return new ModelAndView("againlogin", "returnMsg", "用户名/密码错误");
			}
		}else{
			return new ModelAndView("againlogin", "returnMsg", "登录失败");
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
	 * <p>Title: 查看没有评分的</p>
	 * @date 2014年2月26日
	*/
	@RequestMapping(value="viewWant2PF", method = RequestMethod.GET)
	public ModelAndView viewWant2PF(HttpServletRequest request){
		PFUser user = (PFUser) request.getSession().getAttribute(GlobalFinalAttr.SESSION_USER);
		PFDept dept = (PFDept) request.getSession().getAttribute(GlobalFinalAttr.SESSION_DEPT);;
		ModelAndView mvv = new ModelAndView();
		mvv.addObject("noBePfUserList" , arcServcieImpl.getNoBePfList(user, dept));
		mvv.setViewName("noBePfUserList.jsp");
		return mvv;
	}
	
	/**
	 * <p>Title: 跳转到评分页面</p>
	*/
	@RequestMapping(value="gotoPf")
	public ModelAndView gotoPfPage(HttpServletRequest request , @RequestParam("bePfUserCode") String bePfUserCode ){
		PFUser user = (PFUser) request.getSession().getAttribute(GlobalFinalAttr.SESSION_USER);
		PFUser buser = arcServcieImpl.getSingleUser(bePfUserCode);
		PFDept bdept = arcServcieImpl.getDeptByDid(buser.getPid());
		ModelAndView mvv = new ModelAndView();
		mvv.addObject("operuser" , user);
		mvv.addObject("boperuser" , buser);
		mvv.addObject("boperuserdept" , bdept);
		mvv.addObject("kaoheqi" , kaoHeQi);//考核期
		mvv.setViewName("dafeng.jsp");
		return mvv;
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
	private Logger log =  (Logger) LoggerFactory.getLogger(this.getClass());
}
