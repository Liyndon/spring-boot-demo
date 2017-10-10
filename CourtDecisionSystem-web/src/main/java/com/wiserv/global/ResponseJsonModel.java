package com.wiserv.global;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by lixy on 2017/3/8.
 */
@Data
public class ResponseJsonModel implements Serializable {
    private static final long serialVersionUID = 2206963893306589223L;
    private Boolean success = true;
    private String message;
    private Object body;
}
