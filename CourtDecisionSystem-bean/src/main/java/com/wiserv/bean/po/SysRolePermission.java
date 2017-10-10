package com.wiserv.bean.po;
public class SysRolePermission {
    private Integer id;
    private Integer roleId;//角色标识
    private Integer permissionId;//权限标识
    public SysRolePermission() {
        super();
    }
    public SysRolePermission(Integer id,Integer roleId,Integer permissionId) {
        super();
        this.id = id;
        this.roleId = roleId;
        this.permissionId = permissionId;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return this.roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPermissionId() {
        return this.permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

}
