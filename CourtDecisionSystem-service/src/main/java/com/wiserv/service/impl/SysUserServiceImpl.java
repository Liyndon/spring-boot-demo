package com.wiserv.service.impl;
import java.util.List;
import com.wiserv.dao.SysUserDao;
import com.wiserv.bean.po.SysUser;
import com.wiserv.common.Assist;
import com.wiserv.service.SysUserService;
public class SysUserServiceImpl implements SysUserService{
    private SysUserDao sysUserDao;
    @Override
    public long getSysUserRowCount(Assist assist){
        return sysUserDao.getSysUserRowCount(assist);
    }
    @Override
    public List<SysUser> selectSysUser(Assist assist){
        return sysUserDao.selectSysUser(assist);
    }
    @Override
    public SysUser selectSysUserByObj(SysUser obj){
        return sysUserDao.selectSysUserByObj(obj);
    }
    @Override
    public SysUser selectSysUserById(Integer id){
        return sysUserDao.selectSysUserById(id);
    }
    @Override
    public int insertSysUser(SysUser value){
        return sysUserDao.insertSysUser(value);
    }
    @Override
    public int insertNonEmptySysUser(SysUser value){
        return sysUserDao.insertNonEmptySysUser(value);
    }
    @Override
    public int deleteSysUserById(Integer id){
        return sysUserDao.deleteSysUserById(id);
    }
    @Override
    public int deleteSysUser(Assist assist){
        return sysUserDao.deleteSysUser(assist);
    }
    @Override
    public int updateSysUserById(SysUser enti){
        return sysUserDao.updateSysUserById(enti);
    }
    @Override
    public int updateSysUser(SysUser value, Assist assist){
        return sysUserDao.updateSysUser(value,assist);
    }
    @Override
    public int updateNonEmptySysUserById(SysUser enti){
        return sysUserDao.updateNonEmptySysUserById(enti);
    }
    @Override
    public int updateNonEmptySysUser(SysUser value, Assist assist){
        return sysUserDao.updateNonEmptySysUser(value,assist);
    }

    public SysUserDao getSysUserDao() {
        return this.sysUserDao;
    }

    public void setSysUserDao(SysUserDao sysUserDao) {
        this.sysUserDao = sysUserDao;
    }

}