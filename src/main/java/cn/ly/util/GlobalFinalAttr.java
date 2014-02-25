package cn.ly.util;

import java.io.Serializable;

/**
 * @author: www
 * @Function: 全局常量区
 */
public class GlobalFinalAttr implements Serializable {
	/**
	 * 得到系统WEB-INF/classes路径
	 */
	public static final String BASE_PATH_WEBINF = GlobalFinalAttr.class.getClassLoader().getResource("/").getFile();
	private GlobalFinalAttr() { }
	private static final long serialVersionUID = -1055286768481978085L;
	
	public static final String SESSION_USER = "PB_SESSION_USER";
	public static final String SESSION_DEPT = "PB_SESSION_DEPT";
}
