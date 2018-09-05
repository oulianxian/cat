package com.kukuou.cat.common.exception;

/**
 * 建统一的JSON返回对象
 * @author olx
 * @date 2018/9/5/005
 */
public class Response<T> {
    private String errorCode;
    private String errorMessage;
    private String url;
    private T data;

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
