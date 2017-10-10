package com.wiserv.global;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.io.Serializable;

/**
 * 响应请求
 * Created by lixy on 2017/3/8.
 */
public class ControllerResult implements Serializable {

    private static final long serialVersionUID = 7387219354917244464L;

    public static ResponseEntity success() {
        ResponseJsonModel jsonModel = new ResponseJsonModel();
        return ResponseEntity.ok(jsonModel);
    }

    public static ResponseEntity success(Object o) {
        ResponseJsonModel jsonModel = new ResponseJsonModel();
        jsonModel.setBody(o);
        return ResponseEntity.ok(jsonModel);
    }

    public static ResponseEntity failed() {
        ResponseJsonModel jsonModel = new ResponseJsonModel();
        jsonModel.setSuccess(false);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(jsonModel);
    }

    public static ResponseEntity failed(String errorMessage) {
        ResponseJsonModel jsonModel = new ResponseJsonModel();
        jsonModel.setMessage(errorMessage);
        jsonModel.setSuccess(false);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(jsonModel);
    }

    public static ResponseEntity failed(Exception e) {
        ResponseJsonModel jsonModel = new ResponseJsonModel();
        jsonModel.setMessage("系统内部错误，请联系管理员！");
        jsonModel.setSuccess(false);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(jsonModel);
    }

    public static ResponseEntity failed(HttpStatus status, Exception e) {
        ResponseJsonModel jsonModel = new ResponseJsonModel();
        jsonModel.setMessage(e.getLocalizedMessage());
        jsonModel.setSuccess(false);
        return ResponseEntity.status(status).body(jsonModel);
    }

    public static ResponseEntity notFound() {
        ResponseJsonModel jsonModel = new ResponseJsonModel();
        jsonModel.setSuccess(false);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(jsonModel);
    }
}
