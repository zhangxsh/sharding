package com.xianzhang.sharding.bean;

/**
 * @author alexzhang
 * @date 2020/7/18 11:36
 */
public class UserInfoPriv {
    private Long pid;

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    private Long uid;
    private String pname;
}
