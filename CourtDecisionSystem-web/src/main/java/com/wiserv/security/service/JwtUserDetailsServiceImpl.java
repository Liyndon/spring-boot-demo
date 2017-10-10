package com.wiserv.security.service;

import com.wiserv.bean.po.SysRole;
import com.wiserv.bean.po.SysUser;
import com.wiserv.dao.SysRoleDao;
import com.wiserv.dao.SysUserDao;
import com.wiserv.security.JwtUserFactory;
import com.wiserv.security.exception.UserNameOrPasswordException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lixy on 20.03.16.
 */
@Service
public class JwtUserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private SysUserDao userDao;
    @Autowired
    private SysRoleDao roleDao;


    @Override
    public UserDetails loadUserByUsername(String userName) throws UserNameOrPasswordException {
        SysUser currentUser = new SysUser();
        currentUser.setUserName(userName);
        SysUser user = userDao.selectSysUserByObj(currentUser);
        if (user == null) {
            throw new UserNameOrPasswordException("用户名或密码错误!");
        } else {
            List<SysRole> roles = roleDao.selectSysRoleByUserId(currentUser.getId());
            user.setRoles(roles);
            return JwtUserFactory.create(user);
        }
    }
}
