package com.yangq.selfmotivation.enuma;

/**
 * Created by IntelliJ IDEA.
 * User: Rui
 * Date: 2018/4/28
 * Time: 13:56
 * To change this template use File | Settings | File Templates.
 */
public enum JsonResultEnum {
    SUCCESS("1000","请求成功"),
    FAIL("1001","请求失败"),
    ERROR_PARAM("1002","参数异常"),
    ILLEGAL_REQUEST("1003","请求异常"),
    EDIT_SUCCESS("1000","编辑成功"),
    EDIT_FALSE("1001","编辑失败"),
    PASSWORD_ERROR("2001","账号或密码不正确"),
    LOGIN_EMPTY("2002","登陆账号或密码不能为空"),
    VERIFY_CODE_ERROR("2005","验证码错误"),
    USER_NOT_EXIST("2003","用户不存在"),
    REPASSOWRD_WRONG("2004","两次密码不一致"),
    USERNAME_REPEAT("2006","登录邮箱已存在"),
    OLD_PASSWORD_ERROR("2007","原密码不正确")
    ;

    JsonResultEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String code;
    private String message;


}
