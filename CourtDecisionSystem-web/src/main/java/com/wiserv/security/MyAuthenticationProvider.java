package com.wiserv.security;

import com.wiserv.security.exception.UserNameOrPasswordException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * 密码验证
 * Created by lixy on 2017/9/19.
 */
public class MyAuthenticationProvider extends DaoAuthenticationProvider {

    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
        Object salt = null;
        if (super.getSaltSource() != null) {
            salt = super.getSaltSource().getSalt(userDetails);
        }

        if (authentication.getCredentials() == null) {
            this.logger.debug("用户名或密码错误");
            throw new UserNameOrPasswordException(this.messages.getMessage("用户名或密码错误！", "Bad credentials"));
        } else {
            Md5PasswordEncoder md5PasswordEncoder = new Md5PasswordEncoder();
            String presentedPassword = authentication.getCredentials().toString();
            presentedPassword = md5PasswordEncoder.encodePassword(presentedPassword, salt).toUpperCase();
            if (!userDetails.getPassword().equalsIgnoreCase(presentedPassword)) {
                this.logger.debug("用户名或密码错误");
                throw new UserNameOrPasswordException(this.messages.getMessage("用户名或密码错误！", "Bad credentials"));
            }
        }
    }
}
