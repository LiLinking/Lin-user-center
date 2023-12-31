package com.lin.linusercenterbackend.common;

/**
 * @author lin
 *
 * 错误码
 */
public enum ErrorCode {

    /**
     * 40000 参数错误
     */
    PARAMS_ERROR(40000, "请求参数错误", ""),
    /**
     * 40001 数据为空
     */
    NULL_ERROR(40001, "请求数据为空", ""),
    /**
     * 40100 未登录
     */
    NOT_LOGIN_ERROR(40100, "未登录", ""),
    /**
     * 40101 无权限
     */
    NO_AUTH_ERROR(40101, "无权限", ""),
    /**
     * 50000 内部系统错误
     */
    SYSTEM_ERROR(50000, "系统内部异常", ""),

    OPERATION_ERROR(50001, "操作失败", "操作失败"),

    /**
     * 密码无效
     */
    INVALID_PASSWORD_ERROR(40102, "无效密码", ""),
    /**
     * 成功
     */
    SUCCESS(0, "success", "");
    /**
     * 状态码
     */
    private final int code;
    /**
     * 状态码信息
     */
    private final String message;

    /**
     * 状态码描述
     */
    private final String description;

    ErrorCode(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }
}
