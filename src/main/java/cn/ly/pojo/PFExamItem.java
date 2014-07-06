package cn.ly.pojo;

import java.io.Serializable;
import java.math.BigDecimal;

public class PFExamItem implements Serializable {
    private Integer did;

    private Integer pid;

    private String itemname;

    private BigDecimal itemmaxgrade;

    private static final long serialVersionUID = 1L;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname == null ? null : itemname.trim();
    }

    public BigDecimal getItemmaxgrade() {
        return itemmaxgrade;
    }

    public void setItemmaxgrade(BigDecimal itemmaxgrade) {
        this.itemmaxgrade = itemmaxgrade;
    }
}