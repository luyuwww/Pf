package cn.ly.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class PFEvaluage implements Serializable {
    private Integer did;

    private String themean;

    private BigDecimal nMaxgrade;

    private Integer pid;

    private Float thecount;

    private static final long serialVersionUID = 1L;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getThemean() {
        return themean;
    }

    public void setThemean(String themean) {
        this.themean = themean == null ? null : themean.trim();
    }

    public BigDecimal getnMaxgrade() {
        return nMaxgrade;
    }

    public void setnMaxgrade(BigDecimal nMaxgrade) {
        this.nMaxgrade = nMaxgrade;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Float getThecount() {
        return thecount;
    }

    public void setThecount(Float thecount) {
        this.thecount = thecount;
    }
}