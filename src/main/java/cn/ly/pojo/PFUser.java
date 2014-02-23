package cn.ly.pojo;

import java.io.Serializable;

public class PFUser implements Serializable {
    private Integer did;

    private String uusercode;

    private String uusername;

    private String upassword;

    private Integer pid;

    private Byte ulevel;

    private String ulevelname;

    private String uemail;

    private Byte ublevel;

    private String ublevelname;

    private static final long serialVersionUID = 1L;

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getUusercode() {
        return uusercode;
    }

    public void setUusercode(String uusercode) {
        this.uusercode = uusercode == null ? null : uusercode.trim();
    }

    public String getUusername() {
        return uusername;
    }

    public void setUusername(String uusername) {
        this.uusername = uusername == null ? null : uusername.trim();
    }

    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword == null ? null : upassword.trim();
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Byte getUlevel() {
        return ulevel;
    }

    public void setUlevel(Byte ulevel) {
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

    public Byte getUblevel() {
        return ublevel;
    }

    public void setUblevel(Byte ublevel) {
        this.ublevel = ublevel;
    }

    public String getUblevelname() {
        return ublevelname;
    }

    public void setUblevelname(String ublevelname) {
        this.ublevelname = ublevelname == null ? null : ublevelname.trim();
    }
}