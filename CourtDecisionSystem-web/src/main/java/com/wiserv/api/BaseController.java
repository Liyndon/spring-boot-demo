package com.wiserv.api;

import com.wiserv.security.JwtUser;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * Created by lixy on 2017/9/25.
 */
public class BaseController {

    private JwtUser user;

    protected JwtUser getUser() {
        user = (JwtUser) SecurityContextHolder.getContext()
                .getAuthentication();
        return user;
    }

}
