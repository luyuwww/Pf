package cn.ly.dao.i;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.ly.dao.BaseDao;
import cn.ly.pojo.PFGrade;
import cn.ly.pojo.PFGradeExample;

public interface PFGradeMapper  extends BaseDao{
    int countByExample(PFGradeExample example);

    int deleteByExample(PFGradeExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(PFGrade record);

    int insertSelective(PFGrade record);

    List<PFGrade> selectByExample(PFGradeExample example);

    PFGrade selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") PFGrade record, @Param("example") PFGradeExample example);

    int updateByExample(@Param("record") PFGrade record, @Param("example") PFGradeExample example);

    int updateByPrimaryKeySelective(PFGrade record);

    int updateByPrimaryKey(PFGrade record);
}