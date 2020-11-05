package com.liang.domain;


/**
 * 自定义异常类
 * @author 梁骐镖
 * @date 2020-08-12 14:09
 */
public class BusinessException extends RuntimeException{
    //错误代码
    private ErrorCode errorCode;
    public BusinessException(ErrorCode errorCode) {
        super();
        this.errorCode = errorCode;
    }
    public BusinessException(){
        super();
    }
    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }
    public ErrorCode getErrorCode() {
        return errorCode;
    }
}
