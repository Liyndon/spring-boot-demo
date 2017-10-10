package com.wiserv.bean.po;
public class SysPermission {
    private Integer id;
    private String name;//权限名称
    private String description;//描述
    private String url;//URL地址
    private String code;//权限编码
    private Integer pId;//父级ID
    private Integer state;//状态（1：正常，0：禁用）
    public SysPermission() {
        super();
    }
    public SysPermission(Integer id,String name,String description,String url,String code,Integer pId,Integer state) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
        this.url = url;
        this.code = code;
        this.pId = pId;
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

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getPId() {
        return this.pId;
    }

    public void setPId(Integer pId) {
        this.pId = pId;
    }

    public Integer getState() {
        return this.state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

}
