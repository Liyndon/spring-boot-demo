package com.wiserv.security.exception;

import org.springframework.security.authentication.BadCredentialsException;

/**
 * 密码验证失败
 * Created by lixy on 2017/9/19.
 */
public class UserNameOrPasswordException extends BadCredentialsException {


    public UserNameOrPasswordException(String msg) {
        super(msg);
    }

    public UserNameOrPasswordException(String msg, Throwable t) {
        super(msg, t);
    }
}
