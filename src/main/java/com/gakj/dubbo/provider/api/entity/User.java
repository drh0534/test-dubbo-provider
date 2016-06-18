package com.gakj.dubbo.provider.api.entity;

import java.io.Serializable;

/**
 * Created by gc on 2016/6/16.
 */
public class User implements Serializable {

    private Long id;
    private String name;
    private String pwd;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
