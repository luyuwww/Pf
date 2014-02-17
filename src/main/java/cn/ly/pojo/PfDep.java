package cn.ly.pojo;

import java.io.Serializable;

public class PfDep implements Serializable {
	private static final long serialVersionUID = -4626127667802795010L;

	private Integer depid;

    private String depname;

    private Integer deptype;

    private String deptypename;


    public Integer getDepid() {
        return depid;
    }

    public void setDepid(Integer depid) {
        this.depid = depid;
    }

    public String getDepname() {
        return depname;
    }

    public void setDepname(String depname) {
        this.depname = depname == null ? null : depname.trim();
    }

    public Integer getDeptype() {
        return deptype;
    }

    public void setDeptype(Integer deptype) {
        this.deptype = deptype;
    }

    public String getDeptypename() {
        return deptypename;
    }

    public void setDeptypename(String deptypename) {
        this.deptypename = deptypename == null ? null : deptypename.trim();
    }
}