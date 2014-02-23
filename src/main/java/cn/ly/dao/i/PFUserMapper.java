package cn.ly.dao.i;

import cn.ly.dao.BaseDao;
import cn.ly.pojo.PFUser;
import cn.ly.pojo.PFUserExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface PFUserMapper extends BaseDao {
    int countByExample(PFUserExample example);

    int deleteByExample(PFUserExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(PFUser record);

    int insertSelective(PFUser record);

    List<PFUser> selectByExample(PFUserExample example);

    PFUser selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") PFUser record, @Param("example") PFUserExample example);

    int updateByExample(@Param("record") PFUser record, @Param("example") PFUserExample example);

    int updateByPrimaryKeySelective(PFUser record);

    int updateByPrimaryKey(PFUser record);
    
	@Select("SELECT * FROM PF_USER")
    List<PFUser> getAllUserList();
}