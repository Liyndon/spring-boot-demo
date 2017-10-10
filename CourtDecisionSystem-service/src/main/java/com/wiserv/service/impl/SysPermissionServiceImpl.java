package com.wiserv.service.impl;
import java.util.List;
import com.wiserv.dao.SysPermissionDao;
import com.wiserv.bean.po.SysPermission;
import com.wiserv.common.Assist;
import com.wiserv.service.SysPermissionService;
public class SysPermissionServiceImpl implements SysPermissionService{
    private SysPermissionDao sysPermissionDao;
    @Override
    public long getSysPermissionRowCount(Assist assist){
        return sysPermissionDao.getSysPermissionRowCount(assist);
    }
    @Override
    public List<SysPermission> selectSysPermission(Assist assist){
        return sysPermissionDao.selectSysPermission(assist);
    }
    @Override
    public SysPermission selectSysPermissionByObj(SysPermission obj){
        return sysPermissionDao.selectSysPermissionByObj(obj);
    }
    @Override
    public SysPermission selectSysPermissionById(Integer id){
        return sysPermissionDao.selectSysPermissionById(id);
    }
    @Override
    public int insertSysPermission(SysPermission value){
        return sysPermissionDao.insertSysPermission(value);
    }
    @Override
    public int insertNonEmptySysPermission(SysPermission value){
        return sysPermissionDao.insertNonEmptySysPermission(value);
    }
    @Override
    public int deleteSysPermissionById(Integer id){
        return sysPermissionDao.deleteSysPermissionById(id);
    }
    @Override
    public int deleteSysPermission(Assist assist){
        return sysPermissionDao.deleteSysPermission(assist);
    }
    @Override
    public int updateSysPermissionById(SysPermission enti){
        return sysPermissionDao.updateSysPermissionById(enti);
    }
    @Override
    public int updateSysPermission(SysPermission value, Assist assist){
        return sysPermissionDao.updateSysPermission(value,assist);
    }
    @Override
    public int updateNonEmptySysPermissionById(SysPermission enti){
        return sysPermissionDao.updateNonEmptySysPermissionById(enti);
    }
    @Override
    public int updateNonEmptySysPermission(SysPermission value, Assist assist){
        return sysPermissionDao.updateNonEmptySysPermission(value,assist);
    }

    public SysPermissionDao getSysPermissionDao() {
        return this.sysPermissionDao;
    }

    public void setSysPermissionDao(SysPermissionDao sysPermissionDao) {
        this.sysPermissionDao = sysPermissionDao;
    }

}