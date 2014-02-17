package cn.ly.service.i;

import java.util.List;

import javax.jws.WebService;

import cn.ly.pojo.PfUser;
@WebService
public interface ArcService {
	
	/**
	 * 列出所有用户
	 */
	public List<PfUser> listAllUser();
	
}
