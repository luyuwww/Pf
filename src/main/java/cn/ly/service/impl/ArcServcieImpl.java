package cn.ly.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ly.dao.i.PFDeptMapper;
import cn.ly.dao.i.PFUserMapper;
import cn.ly.pojo.PFDept;
import cn.ly.pojo.PFUser;
import cn.ly.pojo.PFUserExample;
import cn.ly.service.BaseService;
import cn.ly.service.i.ArcService;

@Service("arcServcieImpl")
public class ArcServcieImpl extends BaseService implements ArcService {
	public List<PFUser> listAllUser() {
		return pFUserMapper.getAllUserList();
	}

	public PFUser getSingleUser(String uusercode) {
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

	@Autowired
	private PFUserMapper pFUserMapper;
	@Autowired
	private PFDeptMapper pFDeptMapper;
}
