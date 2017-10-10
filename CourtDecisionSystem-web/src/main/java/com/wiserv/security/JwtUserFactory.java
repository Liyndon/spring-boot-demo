package com.wiserv.security;

import com.wiserv.bean.po.SysRole;
import com.wiserv.bean.po.SysUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.List;
import java.util.stream.Collectors;

public final class JwtUserFactory {

    private JwtUserFactory() {
    }

    public static JwtUser create(SysUser user) {
        return new JwtUser(
                user.getId(),
                user.getUserName(),
                user.getPassword(),
                mapToGrantedAuthorities(user.getRoles()),
                user.getState()
        );
    }


    private static List<GrantedAuthority> mapToGrantedAuthorities(List<SysRole> authorities) {
        return authorities.stream()
                .map(authority -> new SimpleGrantedAuthority(authority.getCode()))
                .collect(Collectors.toList());
    }
}
