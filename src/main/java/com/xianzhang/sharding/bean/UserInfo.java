package com.xianzhang.sharding.bean;

/**
 * @author alexzhang
 * @date 2020/7/18 11:10
 */

public class UserInfo {
    private Long uid;
    private int age;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
