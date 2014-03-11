package cn.ly.dao.i;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.ly.dao.BaseDao;
import cn.ly.pojo.PFDept;
import cn.ly.pojo.PFDeptExample;

public interface PFDeptMapper  extends BaseDao{
    int countByExample(PFDeptExample example);

    int deleteByExample(PFDeptExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(PFDept record);

    int insertSelective(PFDept record);

    List<PFDept> selectByExample(PFDeptExample example);

    PFDept selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") PFDept record, @Param("example") PFDeptExample example);

    int updateByExample(@Param("record") PFDept record, @Param("example") PFDeptExample example);

    int updateByPrimaryKeySelective(PFDept record);

    int updateByPrimaryKey(PFDept record);
}