package com.c414.dload.mall_backend.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult implements Serializable {

    private Boolean success;
    private Integer code;
    private String msg;
    private Object data;

    public static CommonResult success(Object data, String msg) {
        return new CommonResult(true, 200, msg, data);
    }

    public static CommonResult failed(String msg) {
        return new CommonResult(false, 403, msg, null);
    }

}
