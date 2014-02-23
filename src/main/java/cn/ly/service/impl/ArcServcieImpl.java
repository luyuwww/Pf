package cn.ly.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ly.dao.i.PFUserMapper;
import cn.ly.pojo.PFUser;
import cn.ly.service.BaseService;
import cn.ly.service.i.ArcService;

@Service("arcServcieImpl")
public class ArcServcieImpl  extends BaseService implements ArcService{
	public List<PFUser> listAllUser() {
		return pFUserMapper.getAllUserList();
	}
	@Autowired
	private PFUserMapper pFUserMapper;
}
