package com.lzj.vcg.domain;

import java.util.Date;

/**
 * @Description
 * @Author lzj
 * @Date 2019/7/31
 */
public class User {
    private String id;
    private String name;
    private String password;
    private Date createTime;

    public User() {
    }

    public User(String id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
