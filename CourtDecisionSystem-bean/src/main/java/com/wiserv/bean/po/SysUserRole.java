package com.wiserv.bean.po;
public class SysUserRole {
    private Integer id;
    private Integer userId;//用户标识
    private Integer roleId;//角色标识
    public SysUserRole() {
        super();
    }
    public SysUserRole(Integer id,Integer userId,Integer roleId) {
        super();
        this.id = id;
        this.userId = userId;
        this.roleId = roleId;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return this.userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getRoleId() {
        return this.roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

}
