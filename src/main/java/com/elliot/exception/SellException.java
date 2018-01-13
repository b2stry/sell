package com.elliot.exception;

import com.elliot.enums.ResultEnum;

/**
 * Created by Elliot on 2017/9/30.
 *
 * @author Shallowan
 */
public class SellException extends RuntimeException {

    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
