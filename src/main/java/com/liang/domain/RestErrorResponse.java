package com.liang.domain;

/**
 * 错误响应参数包装
 * @author 梁骐镖
 * @date 2020-08-12 14:21
 */

public class RestErrorResponse {

    private String errCode;

    private String errMessage;

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }

    public RestErrorResponse(String errCode, String errMessage){
        this.errCode = errCode;
        this.errMessage= errMessage;
    }


}
