package cn.ly.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>Title: 页面显示成绩</p>
 * <p>Description: </p>
 *
 * @author luyuwww
 * @date 2014年3月11日
 */
public class ViewGrade implements Serializable {
	private static final long serialVersionUID = 7526188246471752416L;

    private String operusercode;

    private String boperusercode;
    
    private String beOperUserDepName;
    
    private Integer beOperUserDepDid;
    
    private String operUserDepName;
    
    private Integer operUserDepDid;

    private Date opertiime;

    private Byte operquarter;

    private Float totalCount;//总成绩
    
    private Integer totalPersons;//打分的总人数
    
    private Float totalAverage;//总平均分
    
    private Float zzCount;//正职位成绩
    
    private Integer zzPersons;//正职位打分的总人数
    
    private Float zzAverage;//正职位平均分
    
    private Float fzCount;//副职总成绩
    
    private Integer fzPersons;//副职打分的总人数
    
    private Float fzAverage;//副职位平均分
    
    private Float zsbmMgrCount;//内设部门管理员打分总成绩
    
    private Integer zsbmMgrPersons;//内设部门管理员打分总人数
    
    private Float zsbmMgrAverage;//内设部门管理员打分平均分

    private Float ptryCount;//普通人员打分总成绩
    
    private Integer ptryPersons;//普通人员打分总人数
    
    private Float ptryAverage;//普通人员打分平均分

    private Integer operuserdid;

    private Integer boperuserdid;

    private String operusername;

    private String boperusername;

    
}