package cn.ly.service.i;

import java.util.List;

import javax.jws.WebService;

import cn.ly.pojo.PFDept;
import cn.ly.pojo.PFUser;
@WebService
public interface ArcService {
	
	/**
	 * 列出所有用户
	 */
	public List<PFUser> listAllUser();
	
	/**
	 * <p>Title: 登录使用得到单个用户</p>
	 * @date 2014年2月24日
	*/
	public PFUser getSingleUser(String uusercode);
	
	/**
	 * <p>Title: 通过did得到部门</p>
	 * <p>Description: </p>
	 * @param did
	 * @return
	 * 
	 * @date 2014年2月24日
	*/
	public PFDept getDeptByDid(Integer did);
	
}
