package com.wiserv.global;

import com.wiserv.security.exception.UserNameOrPasswordException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by lixy on 2017/9/20.
 */
@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(value = UserNameOrPasswordException.class)
    private ResponseEntity userNameOrPasswordException(HttpServletRequest req, UserNameOrPasswordException e) throws Exception {
        ResponseJsonModel jsonModel = new ResponseJsonModel();
        jsonModel.setMessage(e.getMessage());
        jsonModel.setSuccess(false);
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(jsonModel);
    }

    @ExceptionHandler(value = Exception.class)
    private ResponseEntity defaultException(HttpServletRequest req, Exception e) throws Exception {
        ResponseJsonModel jsonModel = new ResponseJsonModel();
        jsonModel.setMessage(e.getMessage());
        jsonModel.setSuccess(false);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(jsonModel);
    }


}
