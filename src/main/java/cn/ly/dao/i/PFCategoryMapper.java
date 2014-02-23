package cn.ly.dao.i;

import cn.ly.dao.BaseDao;
import cn.ly.pojo.PFCategory;
import cn.ly.pojo.PFCategoryExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PFCategoryMapper  extends BaseDao{
    int countByExample(PFCategoryExample example);

    int deleteByExample(PFCategoryExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(PFCategory record);

    int insertSelective(PFCategory record);

    List<PFCategory> selectByExample(PFCategoryExample example);

    PFCategory selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") PFCategory record, @Param("example") PFCategoryExample example);

    int updateByExample(@Param("record") PFCategory record, @Param("example") PFCategoryExample example);

    int updateByPrimaryKeySelective(PFCategory record);

    int updateByPrimaryKey(PFCategory record);
}