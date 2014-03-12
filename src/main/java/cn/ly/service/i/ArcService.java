package cn.ly.service.i;

import java.util.List;
import java.util.Map;

import javax.jws.WebService;

import cn.ly.pojo.PFDept;
import cn.ly.pojo.PFEvaluage;
import cn.ly.pojo.PFGrade;
import cn.ly.pojo.PFUser;
/**
 * <p>Title: ArcService</p>
 * <p>Description: </p>
 *
 * @author luyuwww
 * @date 2014年2月26日
 */
@WebService
public interface ArcService {
	
	/**
	 * 列出所有用户
	 */
	public List<PFUser> listAllUser();
	
	/**
	 * <p>Title: 登录使用得到单个用户通过usercode</p>
	 * @date 2014年2月24日
	*/
	public PFUser getSingleUserCode(String uusercode);
	
	/**
	 * <p>Title: 登录使用得到单个用户通过userdid</p>
	 * @date 2014年2月24日
	 */
	public PFUser getSingleUserDid(Integer userDid);
	
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
	public Integer getADeptUserNum(Integer bmflag , PFUser user);
	
	/**
	 * <p>Title: 根据用户得到当前季度他共计评分了多少人</p>
	*/
	public Integer getHasPfNum(PFUser user);
	
	
	/**
	 * <p>Title: 得到本季度已经被评分的用户列表</p>
	*/
	public List<PFGrade> getHasBePfList(PFUser user);
	/**
	 * <p>Title: 得到本季度未被评分的用户列表</p>
	*/
	public List<PFUser> getNoBePfList(PFUser user , PFDept dept);
	
	/**
	 * <p>Title: 插入一个可选成绩</p>
	 * @date 2014年2月28日
	*/
	public Integer saveGrade(PFGrade grade);
	
	/**
	 * <p>Title: 得到所有用户的分数</p>
	 * @date 2014年3月3日
	*/
	public List<PFGrade> getTotalGrade();
	
	public Map<String, String> getMapBySqlReturnIntStr(String sql , String col1 , String col2);
	
	public Integer insertPfEvaluate(PFEvaluage evalue);
}
