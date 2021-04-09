package com.zwang.cloud.staticdataservice.comon;


/**
 * 通用返回对象
 * Created by macro on 2019/4/19.
 */
public class ResponseCustom<T> {
    /**
     * 状态码
     */
    private long code;
    /**
     * 提示信息
     */
    private String message;
    /**
     * 数据封装
     */
    private T data;

    protected ResponseCustom() {
    }

    protected ResponseCustom(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功返回结果
     *
     * @param data 获取的数据
     */
    public static <T> ResponseCustom<T> success(T data) {
        return new ResponseCustom<T>(ResponseStatusCode.SUCCESS.getCode(), ResponseStatusCode.SUCCESS.getMessage(), data);
    }

    /**
     * 成功返回结果
     *
     * @param data    获取的数据
     * @param message 提示信息
     */
    public static <T> ResponseCustom<T> success(T data, String message) {
        return new ResponseCustom<T>(ResponseStatusCode.SUCCESS.getCode(), message, data);
    }

    /**
     * 失败返回结果
     *
     * @param errorCode 错误码
     */
    public static <T> ResponseCustom<T> failed(ResponseStatusCode errorCode) {
        return new ResponseCustom<T>(errorCode.getCode(), errorCode.getMessage(), null);
    }

    /**
     * 失败返回结果
     *
     * @param errorCode 错误码
     * @param message   错误信息
     */
    public static <T> ResponseCustom<T> failed(ResponseStatusCode errorCode, String message) {
        return new ResponseCustom<T>(errorCode.getCode(), message, null);
    }

    /**
     * 失败返回结果
     *
     * @param message 提示信息
     */
    public static <T> ResponseCustom<T> failed(String message) {
        return new ResponseCustom<T>(ResponseStatusCode.FAILED.getCode(), message, null);
    }

    /**
     * 失败返回结果
     */
    public static <T> ResponseCustom<T> failed() {
        return failed(ResponseStatusCode.FAILED);
    }

    /**
     * 参数验证失败返回结果
     */
    public static <T> ResponseCustom<T> validateFailed() {
        return failed(ResponseStatusCode.VALIDATE_FAILED);
    }

    /**
     * 参数验证失败返回结果
     *
     * @param message 提示信息
     */
    public static <T> ResponseCustom<T> validateFailed(String message) {
        return new ResponseCustom<T>(ResponseStatusCode.VALIDATE_FAILED.getCode(), message, null);
    }

    /**
     * 未登录返回结果
     */
    public static <T> ResponseCustom<T> unauthorized(T data) {
        return new ResponseCustom<T>(ResponseStatusCode.UNAUTHORIZED.getCode(), ResponseStatusCode.UNAUTHORIZED.getMessage(), data);
    }

    /**
     * 未授权返回结果
     */
    public static <T> ResponseCustom<T> forbidden(T data) {
        return new ResponseCustom<T>(ResponseStatusCode.FORBIDDEN.getCode(), ResponseStatusCode.FORBIDDEN.getMessage(), data);
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
