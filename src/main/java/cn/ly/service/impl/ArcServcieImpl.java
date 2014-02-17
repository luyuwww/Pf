package cn.ly.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.ly.dao.i.PfUserMapper;
import cn.ly.pojo.PfUser;
import cn.ly.service.BaseService;
import cn.ly.service.i.ArcService;

@Service("arcServcieImpl")
public class ArcServcieImpl  extends BaseService implements ArcService{
	public List<PfUser> listAllUser() {
		return pfUserMapper.getAllUserList();
	}
	@Autowired
	private PfUserMapper pfUserMapper;
}
