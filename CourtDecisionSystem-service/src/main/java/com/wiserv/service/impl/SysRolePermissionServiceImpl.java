package com.wiserv.service.impl;
import java.util.List;
import com.wiserv.dao.SysRolePermissionDao;
import com.wiserv.bean.po.SysRolePermission;
import com.wiserv.common.Assist;
import com.wiserv.service.SysRolePermissionService;
public class SysRolePermissionServiceImpl implements SysRolePermissionService{
    private SysRolePermissionDao sysRolePermissionDao;
    @Override
    public long getSysRolePermissionRowCount(Assist assist){
        return sysRolePermissionDao.getSysRolePermissionRowCount(assist);
    }
    @Override
    public List<SysRolePermission> selectSysRolePermission(Assist assist){
        return sysRolePermissionDao.selectSysRolePermission(assist);
    }
    @Override
    public SysRolePermission selectSysRolePermissionByObj(SysRolePermission obj){
        return sysRolePermissionDao.selectSysRolePermissionByObj(obj);
    }
    @Override
    public SysRolePermission selectSysRolePermissionById(Integer id){
        return sysRolePermissionDao.selectSysRolePermissionById(id);
    }
    @Override
    public int insertSysRolePermission(SysRolePermission value){
        return sysRolePermissionDao.insertSysRolePermission(value);
    }
    @Override
    public int insertNonEmptySysRolePermission(SysRolePermission value){
        return sysRolePermissionDao.insertNonEmptySysRolePermission(value);
    }
    @Override
    public int deleteSysRolePermissionById(Integer id){
        return sysRolePermissionDao.deleteSysRolePermissionById(id);
    }
    @Override
    public int deleteSysRolePermission(Assist assist){
        return sysRolePermissionDao.deleteSysRolePermission(assist);
    }
    @Override
    public int updateSysRolePermissionById(SysRolePermission enti){
        return sysRolePermissionDao.updateSysRolePermissionById(enti);
    }
    @Override
    public int updateSysRolePermission(SysRolePermission value, Assist assist){
        return sysRolePermissionDao.updateSysRolePermission(value,assist);
    }
    @Override
    public int updateNonEmptySysRolePermissionById(SysRolePermission enti){
        return sysRolePermissionDao.updateNonEmptySysRolePermissionById(enti);
    }
    @Override
    public int updateNonEmptySysRolePermission(SysRolePermission value, Assist assist){
        return sysRolePermissionDao.updateNonEmptySysRolePermission(value,assist);
    }

    public SysRolePermissionDao getSysRolePermissionDao() {
        return this.sysRolePermissionDao;
    }

    public void setSysRolePermissionDao(SysRolePermissionDao sysRolePermissionDao) {
        this.sysRolePermissionDao = sysRolePermissionDao;
    }

}