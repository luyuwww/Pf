package cn.ly.dao.i;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import cn.ly.dao.BaseDao;
import cn.ly.pojo.PfUser;
import cn.ly.pojo.PfUserExample;

public interface PfUserMapper extends BaseDao  {
    int countByExample(PfUserExample example);

    int deleteByExample(PfUserExample example);

    int deleteByPrimaryKey(Integer uid);

    int insert(PfUser record);

    int insertSelective(PfUser record);

    List<PfUser> selectByExample(PfUserExample example);

    PfUser selectByPrimaryKey(Integer uid);

    int updateByExampleSelective(@Param("record") PfUser record, @Param("example") PfUserExample example);

    int updateByExample(@Param("record") PfUser record, @Param("example") PfUserExample example);

    int updateByPrimaryKeySelective(PfUser record);

    int updateByPrimaryKey(PfUser record);
    
	@Select("SELECT * FROM PF_USER")
    List<PfUser> getAllUserList();
}