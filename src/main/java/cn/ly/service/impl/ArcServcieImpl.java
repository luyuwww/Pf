package cn.ly.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import cn.ly.dao.i.PFDeptMapper;
import cn.ly.dao.i.PFEvaluageMapper;
import cn.ly.dao.i.PFGradeMapper;
import cn.ly.dao.i.PFUserMapper;
import cn.ly.pojo.PFDept;
import cn.ly.pojo.PFEvaluage;
import cn.ly.pojo.PFGrade;
import cn.ly.pojo.PFUser;
import cn.ly.pojo.PFUserExample;
import cn.ly.service.BaseService;
import cn.ly.service.i.ArcService;

@Service("arcServcieImpl")
public class ArcServcieImpl extends BaseService implements ArcService {
	public List<PFUser> listAllUser() {
		return pFUserMapper.getAllUserList();
	}
	
	public PFUser getSingleUserDid(Integer userDid){
		return pFUserMapper.selectByPrimaryKey(userDid);
	}

	public PFUser getSingleUserCode(String uusercode) {
		PFUserExample userEx = new PFUserExample();
		userEx.createCriteria().andUusercodeEqualTo(uusercode);
		List<PFUser> results = pFUserMapper.selectByExample(userEx);
		if (results.size() == 1) {
			return results.get(0);
		} else if (results.size() > 1) {
			throw new RuntimeException("Query return " + results.size() + " results instead of max 1,usercode重复了");
		}
		return null;
	}
	
	public PFDept getDeptByDid(Integer did){
		return pFDeptMapper.selectByPrimaryKey(did);
	}

	public Integer getADeptUserNum(Integer bmflag , PFUser user){
		return pFUserMapper.onDeptUserNum(bmflag , user.getDid());
	}
	public Integer getHasPfNum(PFUser user){
		return pFUserMapper.getHasPfNum(quarter, user.getDid());
	}
	
	public List<PFGrade> getHasBePfList(PFUser user){
		return pFUserMapper.getHasPfUserList(user.getUusercode() , quarter);
	}
	
	public List<PFUser> getNoBePfList(PFUser user , PFDept dept){
		return pFUserMapper.getNoBePfList(dept.getBmflag(), user.getDid(), quarter);
	}
	
	public Integer saveGrade(PFGrade grade){
		return pFGradeMapper.insertSelective(grade);
		
	}
	public List<PFGrade> getTotalGrade() {
		return pFUserMapper.getTotalPersonGrade();
	}
	
	//当前季度
	@Autowired
	@Value("${pf.opert.quarter}")
	private Byte quarter;
	
	@Autowired
	private PFUserMapper pFUserMapper;
	@Autowired
	private PFDeptMapper pFDeptMapper;
	@Autowired
	private PFGradeMapper pFGradeMapper;
	@Autowired
	private PFEvaluageMapper pFEvaluageMapper;
	@Override
	public Map<String, String> getMapBySqlReturnIntStr(String sql,
			String col1, String col2) {
		return super.quert2Colum4Map(sql, col1, col2);
	}

	public Integer insertPfEvaluate(PFEvaluage evalue) {
		return pFEvaluageMapper.insertSelective(evalue);
	}

	public List<PFEvaluage> getBePfDetail(String boperusercode , String operusercode , Byte quarter) {
		return pFEvaluageMapper.getBePfDetail(boperusercode , operusercode , quarter);
	}
}
