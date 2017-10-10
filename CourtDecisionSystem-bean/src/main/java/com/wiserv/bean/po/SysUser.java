package com.wiserv.bean.po;

import java.util.List;

public class SysUser {
    private Integer id;
    private String userName;//用户名
    private String password;//密码
    private String realName;//名称
    private Integer state;//用户状态(1:正常，0：禁用)

    private List<SysRole> roles;

    public SysUser() {
        super();
    }

    public SysUser(Integer id, String userName, String password, String realName, Integer state) {
        super();
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.realName = realName;
        this.state = state;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return this.realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getState() {
        return this.state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public List<SysRole> getRoles() {
        return roles;
    }

    public void setRoles(List<SysRole> roles) {
        this.roles = roles;
    }
}
