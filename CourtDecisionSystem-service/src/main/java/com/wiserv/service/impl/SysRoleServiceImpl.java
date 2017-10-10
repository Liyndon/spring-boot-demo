package com.wiserv.service.impl;
import java.util.List;
import com.wiserv.dao.SysRoleDao;
import com.wiserv.bean.po.SysRole;
import com.wiserv.common.Assist;
import com.wiserv.service.SysRoleService;
public class SysRoleServiceImpl implements SysRoleService{
    private SysRoleDao sysRoleDao;
    @Override
    public long getSysRoleRowCount(Assist assist){
        return sysRoleDao.getSysRoleRowCount(assist);
    }
    @Override
    public List<SysRole> selectSysRole(Assist assist){
        return sysRoleDao.selectSysRole(assist);
    }
    @Override
    public SysRole selectSysRoleByObj(SysRole obj){
        return sysRoleDao.selectSysRoleByObj(obj);
    }
    @Override
    public SysRole selectSysRoleById(Integer id){
        return sysRoleDao.selectSysRoleById(id);
    }
    @Override
    public int insertSysRole(SysRole value){
        return sysRoleDao.insertSysRole(value);
    }
    @Override
    public int insertNonEmptySysRole(SysRole value){
        return sysRoleDao.insertNonEmptySysRole(value);
    }
    @Override
    public int deleteSysRoleById(Integer id){
        return sysRoleDao.deleteSysRoleById(id);
    }
    @Override
    public int deleteSysRole(Assist assist){
        return sysRoleDao.deleteSysRole(assist);
    }
    @Override
    public int updateSysRoleById(SysRole enti){
        return sysRoleDao.updateSysRoleById(enti);
    }
    @Override
    public int updateSysRole(SysRole value, Assist assist){
        return sysRoleDao.updateSysRole(value,assist);
    }
    @Override
    public int updateNonEmptySysRoleById(SysRole enti){
        return sysRoleDao.updateNonEmptySysRoleById(enti);
    }
    @Override
    public int updateNonEmptySysRole(SysRole value, Assist assist){
        return sysRoleDao.updateNonEmptySysRole(value,assist);
    }

    public SysRoleDao getSysRoleDao() {
        return this.sysRoleDao;
    }

    public void setSysRoleDao(SysRoleDao sysRoleDao) {
        this.sysRoleDao = sysRoleDao;
    }

}