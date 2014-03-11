package cn.ly.pojo;

import java.io.Serializable;

/**
 * <p>Title: 查查每个人打分多少人</p>
 * <p>Description: </p>
 *
 * @author luyuwww
 * @date 2014年3月11日
 */
public class LookWorkLoad implements Serializable {

	private static final long serialVersionUID = 4952623056794007117L;

    private String operUserCode;
    
    private String operUserName;
    
    private Integer operUserNameDid;
    
    private String operUserDepName;
    
    private Integer operUserDepDid;
    
    private Integer hasOperCount;//已经打分的人数
    
    private Integer totalTodoOperCount;//所有需要被打分的人数

    
}