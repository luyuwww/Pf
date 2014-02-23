package cn.ly.dao.i;

import cn.ly.dao.BaseDao;
import cn.ly.pojo.PFEvaluage;
import cn.ly.pojo.PFEvaluageExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PFEvaluageMapper  extends BaseDao{
    int countByExample(PFEvaluageExample example);

    int deleteByExample(PFEvaluageExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(PFEvaluage record);

    int insertSelective(PFEvaluage record);

    List<PFEvaluage> selectByExample(PFEvaluageExample example);

    PFEvaluage selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") PFEvaluage record, @Param("example") PFEvaluageExample example);

    int updateByExample(@Param("record") PFEvaluage record, @Param("example") PFEvaluageExample example);

    int updateByPrimaryKeySelective(PFEvaluage record);

    int updateByPrimaryKey(PFEvaluage record);
}