package cn.ly.pojo;

import java.io.Serializable;

public class PfUser implements Serializable {
	private static final long serialVersionUID = 4291650957634890019L;

	private Integer uid;

    private String uusercode;

    private String upassword;

    private String uusername;

    private Integer depid;

    private String depname;

    private Integer ulevel;

    private String ulevelname;

    private String uemail;

    private Integer ublevel;

    private String ublevelname;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUusercode() {
        return uusercode;
    }

    public void setUusercode(String uusercode) {
        this.uusercode = uusercode == null ? null : uusercode.trim();
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword == null ? null : upassword.trim();
    }

    public String getUusername() {
        return uusername;
    }

    public void setUusername(String uusername) {
        this.uusername = uusername == null ? null : uusername.trim();
    }

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

    public Integer getUlevel() {
        return ulevel;
    }

    public void setUlevel(Integer ulevel) {
        this.ulevel = ulevel;
    }

    public String getUlevelname() {
        return ulevelname;
    }

    public void setUlevelname(String ulevelname) {
        this.ulevelname = ulevelname == null ? null : ulevelname.trim();
    }

    public String getUemail() {
        return uemail;
    }

    public void setUemail(String uemail) {
        this.uemail = uemail == null ? null : uemail.trim();
    }

    public Integer getUblevel() {
        return ublevel;
    }

    public void setUblevel(Integer ublevel) {
        this.ublevel = ublevel;
    }

    public String getUblevelname() {
        return ublevelname;
    }

    public void setUblevelname(String ublevelname) {
        this.ublevelname = ublevelname == null ? null : ublevelname.trim();
    }
}