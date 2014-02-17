package cn.ly.dao.i;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.ly.dao.BaseDao;
import cn.ly.pojo.PfDep;
import cn.ly.pojo.PfDepExample;

public interface PfDepMapper  extends BaseDao {
    int countByExample(PfDepExample example);

    int deleteByExample(PfDepExample example);

    int deleteByPrimaryKey(Integer depid);

    int insert(PfDep record);

    int insertSelective(PfDep record);

    List<PfDep> selectByExample(PfDepExample example);

    PfDep selectByPrimaryKey(Integer depid);

    int updateByExampleSelective(@Param("record") PfDep record, @Param("example") PfDepExample example);

    int updateByExample(@Param("record") PfDep record, @Param("example") PfDepExample example);

    int updateByPrimaryKeySelective(PfDep record);

    int updateByPrimaryKey(PfDep record);
}