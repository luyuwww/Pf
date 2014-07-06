package cn.ly.pojo;

import java.io.Serializable;

public class PFDept implements Serializable {
    private Integer did;

    private String dname;

    private Byte dtype;

    private Integer pid;

    private String dtypename;

    private Integer bmflag;

    private static final long serialVersionUID = 1L;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    public Byte getDtype() {
        return dtype;
    }

    public void setDtype(Byte dtype) {
        this.dtype = dtype;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getDtypename() {
        return dtypename;
    }

    public void setDtypename(String dtypename) {
        this.dtypename = dtypename == null ? null : dtypename.trim();
    }

    public Integer getBmflag() {
        return bmflag;
    }

    public void setBmflag(Integer bmflag) {
        this.bmflag = bmflag;
    }
}