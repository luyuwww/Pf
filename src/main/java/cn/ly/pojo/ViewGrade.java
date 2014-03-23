package cn.ly.pojo;

import java.io.Serializable;

/**
 * <p>Title: 页面显示成绩</p>
 * <p>Description: </p>
 *
 * @author luyuwww
 * @date 2014年3月11日
 */
public class ViewGrade implements Serializable {
	private static final long serialVersionUID = 7526188246471752416L;

    private String boperusercode;
    private String boperusername;
    private Integer boperuserdid;
    private String beOperUserDepName;
    private Integer beOperUserDepDid;

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
	public String getBoperusercode() {
		return boperusercode;
	}
	public void setBoperusercode(String boperusercode) {
		this.boperusercode = boperusercode;
	}
	public String getBoperusername() {
		return boperusername;
	}
	public void setBoperusername(String boperusername) {
		this.boperusername = boperusername;
	}
	public Integer getBoperuserdid() {
		return boperuserdid;
	}
	public void setBoperuserdid(Integer boperuserdid) {
		this.boperuserdid = boperuserdid;
	}
	public String getBeOperUserDepName() {
		return beOperUserDepName;
	}
	public void setBeOperUserDepName(String beOperUserDepName) {
		this.beOperUserDepName = beOperUserDepName;
	}
	public Integer getBeOperUserDepDid() {
		return beOperUserDepDid;
	}
	public void setBeOperUserDepDid(Integer beOperUserDepDid) {
		this.beOperUserDepDid = beOperUserDepDid;
	}
	public Float getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Float totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getTotalPersons() {
		return totalPersons;
	}
	public void setTotalPersons(Integer totalPersons) {
		this.totalPersons = totalPersons;
	}
	public Float getTotalAverage() {
		return totalAverage;
	}
	public void setTotalAverage(Float totalAverage) {
		this.totalAverage = totalAverage;
	}
	public Float getZzCount() {
		return zzCount;
	}
	public void setZzCount(Float zzCount) {
		this.zzCount = zzCount;
	}
	public Integer getZzPersons() {
		return zzPersons;
	}
	public void setZzPersons(Integer zzPersons) {
		this.zzPersons = zzPersons;
	}
	public Float getZzAverage() {
		return zzAverage;
	}
	public void setZzAverage(Float zzAverage) {
		this.zzAverage = zzAverage;
	}
	public Float getFzCount() {
		return fzCount;
	}
	public void setFzCount(Float fzCount) {
		this.fzCount = fzCount;
	}
	public Integer getFzPersons() {
		return fzPersons;
	}
	public void setFzPersons(Integer fzPersons) {
		this.fzPersons = fzPersons;
	}
	public Float getFzAverage() {
		return fzAverage;
	}
	public void setFzAverage(Float fzAverage) {
		this.fzAverage = fzAverage;
	}
	public Float getZsbmMgrCount() {
		return zsbmMgrCount;
	}
	public void setZsbmMgrCount(Float zsbmMgrCount) {
		this.zsbmMgrCount = zsbmMgrCount;
	}
	public Integer getZsbmMgrPersons() {
		return zsbmMgrPersons;
	}
	public void setZsbmMgrPersons(Integer zsbmMgrPersons) {
		this.zsbmMgrPersons = zsbmMgrPersons;
	}
	public Float getZsbmMgrAverage() {
		return zsbmMgrAverage;
	}
	public void setZsbmMgrAverage(Float zsbmMgrAverage) {
		this.zsbmMgrAverage = zsbmMgrAverage;
	}
	public Float getPtryCount() {
		return ptryCount;
	}
	public void setPtryCount(Float ptryCount) {
		this.ptryCount = ptryCount;
	}
	public Integer getPtryPersons() {
		return ptryPersons;
	}
	public void setPtryPersons(Integer ptryPersons) {
		this.ptryPersons = ptryPersons;
	}
	public Float getPtryAverage() {
		return ptryAverage;
	}
	public void setPtryAverage(Float ptryAverage) {
		this.ptryAverage = ptryAverage;
	}
}