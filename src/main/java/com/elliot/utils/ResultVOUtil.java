package com.elliot.utils;

import com.elliot.VO.ResultVO;

/**
 * Created by Elliot on 2017/9/29.
 */
public class ResultVOUtil {

    public static ResultVO success(Object o) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(o);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO errot(Integer code, String msg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);

        return resultVO;
    }
}
