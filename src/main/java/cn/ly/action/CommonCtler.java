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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ch.qos.logback.classic.Logger;
import cn.ly.service.i.ArcService;

@Controller
public class CommonCtler {
	/**
	 * 主页跳转
	 */
	@RequestMapping(value={"/index.html","/"})
	public String gotoIndex() {
		return "index.jsp";
	}
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
	private Logger log =  (Logger) LoggerFactory.getLogger(this.getClass());
}
