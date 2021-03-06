package com.liang.domain;


/**
 * 异常编码
 * @author 梁骐镖
 * @date 2020-08-12 14:14
 */
public enum CommonErrorCode implements ErrorCode {

    ////////////////////////////////////公用异常编码 //////////////////////////
    E_100101(100101,"传入参数与接口不匹配"),
    E_100102(100102,"验证码错误"),
    E_100103(100103,"验证码为空"),
    E_100104(100104,"查询结果为空"),
    E_100105(100105,"ID格式不正确或超出Long存储范围"),
    E_100106(100106,"上传错误"),
    E_100107(100107,"发送验证码错误"),
    E_100108(100108,"传入对象为空"),
    E_100109(100109,"手机号格式不正确"),
    E_100110(100110,"用户名为空"),
    E_100111(100111,"密码为空"),
    E_100112(100112,"手机号为空"),
    E_100113(100113,"手机号已存在"),
    E_100114(100114,"用户名已存在"),
    E_100115(100115,"密码不正确"),

    ////////////////////////////////////SAAS服务异常编码110 //////////////////////////
    E_110001(110001,"账号不存在"),
    E_110002(110002,"角色编码在同一用户中已存在，不可重复"),
    E_110003(110003,"角色为空"),
    E_110004(110004,"角色已绑定账号，被使用中不可删除"),
    E_110005(110005,"权限集合为空"),
    E_110006(110006,"参数为空"),
    E_110007(110007,"未查询到用户关联的角色"),
    E_110008(110008,"账号被其他租户使用，不可删除"),
    /**
     * 未知错误
     */
    UNKNOWN(999999,"未知错误");


    private int code;
    private String desc;

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    private CommonErrorCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }


    public static CommonErrorCode setErrorCode(int code) {
        for (CommonErrorCode errorCode : CommonErrorCode.values()) {
            if (errorCode.getCode()==code) {
                return errorCode;
            }
        }
        return null;
    }
}
