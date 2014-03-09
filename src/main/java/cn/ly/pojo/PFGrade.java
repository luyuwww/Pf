package cn.ly.pojo;

import java.io.Serializable;
import java.util.Date;

public class PFGrade implements Serializable {
    /** serialVersionUID*/
	private static final long serialVersionUID = 7526188246471752416L;

	private Integer did;

    private String operusercode;

    private String boperusercode;

    private Date opertiime;

    private Byte operquarter;

    private Float taccount;

    private Byte isok;

    private Integer operuserdid;

    private Integer boperuserdid;

    private String operusername;

    private String boperusername;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getOperusercode() {
        return operusercode;
    }

    public void setOperusercode(String operusercode) {
        this.operusercode = operusercode == null ? null : operusercode.trim();
    }

    public String getBoperusercode() {
        return boperusercode;
    }

    public void setBoperusercode(String boperusercode) {
        this.boperusercode = boperusercode == null ? null : boperusercode.trim();
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
        this.operusername = operusername == null ? null : operusername.trim();
    }

    public String getBoperusername() {
        return boperusername;
    }

    public void setBoperusername(String boperusername) {
        this.boperusername = boperusername == null ? null : boperusername.trim();
    }
}