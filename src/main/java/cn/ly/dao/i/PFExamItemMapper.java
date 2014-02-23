package cn.ly.dao.i;

import cn.ly.dao.BaseDao;
import cn.ly.pojo.PFExamItem;
import cn.ly.pojo.PFExamItemExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface PFExamItemMapper  extends BaseDao{
    int countByExample(PFExamItemExample example);

    int deleteByExample(PFExamItemExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(PFExamItem record);

    int insertSelective(PFExamItem record);

    List<PFExamItem> selectByExample(PFExamItemExample example);

    PFExamItem selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") PFExamItem record, @Param("example") PFExamItemExample example);

    int updateByExample(@Param("record") PFExamItem record, @Param("example") PFExamItemExample example);

    int updateByPrimaryKeySelective(PFExamItem record);

    int updateByPrimaryKey(PFExamItem record);
}