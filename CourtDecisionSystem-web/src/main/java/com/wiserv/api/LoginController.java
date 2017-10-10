package com.wiserv.api;

import com.wiserv.global.ControllerDefs;
import com.wiserv.security.JwtTokenUtil;
import com.wiserv.security.service.JwtAuthenticationResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.mobile.device.Device;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

/**
 * Created by lixy on 2017/9/18.
 */
@Slf4j
@Api(value = "用户登录类", description = "登录")
@RestController
@RequestMapping(ControllerDefs.BIZ_CTRL_PREFIX + ControllerDefs.VERSION)
public class LoginController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserDetailsService userDetailsService;

    /**
     * 用户登录
     *
     * @return
     */
    @ApiOperation(value = "用户登录", tags = "登录", httpMethod = "POST")
    @RequestMapping(value = "/login", method = RequestMethod.POST)
   /* @ApiImplicitParams({
            @ApiImplicitParam(value = "userName"),
            @ApiImplicitParam(value = "password")})*/
    public ResponseEntity login(@RequestParam String userName, @RequestParam String password, Device device) throws AuthenticationException {
        log.info("sadf");
        // Perform the security
        final Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(userName, password
                )
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);

        // Reload password post-security so we can generate token
        final UserDetails userDetails = userDetailsService.loadUserByUsername(userName);
        final String token = jwtTokenUtil.generateToken(userDetails, device);
        // Return the token
        return ResponseEntity.ok(new JwtAuthenticationResponse(token));
    }
}
