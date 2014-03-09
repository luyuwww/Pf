package cn.ly.pojo;

import java.io.Serializable;
import java.util.Date;

public class ViewGrade implements Serializable {
	private static final long serialVersionUID = 7526188246471752416L;

    private String operusercode;

    private String boperusercode;

    private Date opertiime;

    private Byte operquarter;

    private Float taccount;//总成绩
    
    private Float zzDFCount;//正职打分成绩
    
    private Float nsfzrDFCount;//内设负责人打分
    
    private Float averageCount;//所有的平均分
    
    private Float otherTotalCount;//其它打分者的总分
    
    private Float otherAverageCount;//其它打分者的平均分
    
    private Integer beDfTimes;//被打分次数

    private Byte isok;

    private Integer operuserdid;

    private Integer boperuserdid;

    private String operusername;

    private String boperusername;

	public String getOperusercode() {
		return operusercode;
	}

	public void setOperusercode(String operusercode) {
		this.operusercode = operusercode;
	}

	public String getBoperusercode() {
		return boperusercode;
	}

	public void setBoperusercode(String boperusercode) {
		this.boperusercode = boperusercode;
	}

	public Date getOpertiime() {
		return opertiime;
	}

	public void setOpertiime(Date opertiime) {
		this.opertiime = opertiime;
	}

	public Byte getOperquarter() {
		return operquarter;
	}

	public void setOperquarter(Byte operquarter) {
		this.operquarter = operquarter;
	}

	public Float getTaccount() {
		return taccount;
	}

	public void setTaccount(Float taccount) {
		this.taccount = taccount;
	}

	public Float getZzDFCount() {
		return zzDFCount;
	}

	public void setZzDFCount(Float zzDFCount) {
		this.zzDFCount = zzDFCount;
	}

	public Float getNsfzrDFCount() {
		return nsfzrDFCount;
	}

	public void setNsfzrDFCount(Float nsfzrDFCount) {
		this.nsfzrDFCount = nsfzrDFCount;
	}

	public Float getAverageCount() {
		return averageCount;
	}

	public void setAverageCount(Float averageCount) {
		this.averageCount = averageCount;
	}

	public Float getOtherTotalCount() {
		return otherTotalCount;
	}

	public void setOtherTotalCount(Float otherTotalCount) {
		this.otherTotalCount = otherTotalCount;
	}

	public Float getOtherAverageCount() {
		return otherAverageCount;
	}

	public void setOtherAverageCount(Float otherAverageCount) {
		this.otherAverageCount = otherAverageCount;
	}

	public Byte getIsok() {
		return isok;
	}

	public void setIsok(Byte isok) {
		this.isok = isok;
	}

	public Integer getOperuserdid() {
		return operuserdid;
	}

	public void setOperuserdid(Integer operuserdid) {
		this.operuserdid = operuserdid;
	}

	public Integer getBoperuserdid() {
		return boperuserdid;
	}

	public void setBoperuserdid(Integer boperuserdid) {
		this.boperuserdid = boperuserdid;
	}

	public String getOperusername() {
		return operusername;
	}

	public void setOperusername(String operusername) {
		this.operusername = operusername;
	}

	public String getBoperusername() {
		return boperusername;
	}

	public void setBoperusername(String boperusername) {
		this.boperusername = boperusername;
	}
    
}