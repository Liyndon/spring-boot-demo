package com.wiserv.security;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.Maps;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;
import java.util.Map;

/**
 * 无权限处理
 */
@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint, Serializable {

    private static final long serialVersionUID = -8970718410437077606L;

    //当访问的资源没有权限，会调用这里
    @Override
    public void commence(HttpServletRequest request,
                         HttpServletResponse response,
                         AuthenticationException authException) throws IOException {
        //返回json形式的错误信息
        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        Map result = Maps.newHashMap();
        result.put("code", 403);
        result.put("message", "没有登录或登录已过期!");
        response.getWriter().println(JSON.toJSON(result));
        response.getWriter().flush();
    }
}