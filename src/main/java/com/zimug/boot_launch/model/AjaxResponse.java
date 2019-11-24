package com.zimug.boot_launch.model;

import lombok.Data;

/**
 * @Author: lodi
 * @Date: 2019/11/24 下午9:48
 * @Version 1.0
 */

@Data

public class AjaxResponse {

    private boolean isok;
    private int code;
    private String message;
    private Object data;

    private AjaxResponse() {

    }

    public static AjaxResponse success() {
        AjaxResponse resultBean = new AjaxResponse();
        resultBean.setIsok(true);
        resultBean.setCode(200);
        resultBean.setMessage("success");
        return resultBean;
    }

    public static AjaxResponse success(Object data) {
        AjaxResponse resultBean = new AjaxResponse();
        resultBean.setIsok(true);
        resultBean.setCode(200);
        resultBean.setMessage("success");
        resultBean.setData(data);
        return resultBean;
    }


}
