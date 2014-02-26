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
	
	/**
	 * <p>Title: 得到同一个打分部门下的所有用户数</p>
	 * <p>Description: </p>
	 * @return
	 * 
	 * @date 2014年2月26日
	*/
	public Integer getADeptUserNum(Integer bmflag);
	
	/**
	 * <p>Title: 根据用户得到当前季度他共计评分了多少人</p>
	*/
	public Integer getHasPfNum(PFUser user);
}
