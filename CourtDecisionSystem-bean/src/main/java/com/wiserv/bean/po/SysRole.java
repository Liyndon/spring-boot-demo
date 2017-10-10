package com.wiserv.bean.po;
public class SysRole {
    private Integer id;
    private String name;//角色名称
    private String code;//角色编码
    private Integer state;//状态(1:正常，0：禁用)
    public SysRole() {
        super();
    }
    public SysRole(Integer id,String name,String code,Integer state) {
        super();
        this.id = id;
        this.name = name;
        this.code = code;
        this.state = state;
    }
    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getState() {
        return this.state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

}
