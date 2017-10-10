package com.wiserv.service.impl;
import java.util.List;
import com.wiserv.dao.SysUserRoleDao;
import com.wiserv.bean.po.SysUserRole;
import com.wiserv.common.Assist;
import com.wiserv.service.SysUserRoleService;
public class SysUserRoleServiceImpl implements SysUserRoleService{
    private SysUserRoleDao sysUserRoleDao;
    @Override
    public long getSysUserRoleRowCount(Assist assist){
        return sysUserRoleDao.getSysUserRoleRowCount(assist);
    }
    @Override
    public List<SysUserRole> selectSysUserRole(Assist assist){
        return sysUserRoleDao.selectSysUserRole(assist);
    }
    @Override
    public SysUserRole selectSysUserRoleByObj(SysUserRole obj){
        return sysUserRoleDao.selectSysUserRoleByObj(obj);
    }
    @Override
    public SysUserRole selectSysUserRoleById(Integer id){
        return sysUserRoleDao.selectSysUserRoleById(id);
    }
    @Override
    public int insertSysUserRole(SysUserRole value){
        return sysUserRoleDao.insertSysUserRole(value);
    }
    @Override
    public int insertNonEmptySysUserRole(SysUserRole value){
        return sysUserRoleDao.insertNonEmptySysUserRole(value);
    }
    @Override
    public int deleteSysUserRoleById(Integer id){
        return sysUserRoleDao.deleteSysUserRoleById(id);
    }
    @Override
    public int deleteSysUserRole(Assist assist){
        return sysUserRoleDao.deleteSysUserRole(assist);
    }
    @Override
    public int updateSysUserRoleById(SysUserRole enti){
        return sysUserRoleDao.updateSysUserRoleById(enti);
    }
    @Override
    public int updateSysUserRole(SysUserRole value, Assist assist){
        return sysUserRoleDao.updateSysUserRole(value,assist);
    }
    @Override
    public int updateNonEmptySysUserRoleById(SysUserRole enti){
        return sysUserRoleDao.updateNonEmptySysUserRoleById(enti);
    }
    @Override
    public int updateNonEmptySysUserRole(SysUserRole value, Assist assist){
        return sysUserRoleDao.updateNonEmptySysUserRole(value,assist);
    }

    public SysUserRoleDao getSysUserRoleDao() {
        return this.sysUserRoleDao;
    }

    public void setSysUserRoleDao(SysUserRoleDao sysUserRoleDao) {
        this.sysUserRoleDao = sysUserRoleDao;
    }

}