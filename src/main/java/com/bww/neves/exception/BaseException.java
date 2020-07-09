package com.bww.neves.exception;

import cn.hutool.core.util.StrUtil;

public class BaseException extends RuntimeException {

    private static final long serialVersionUID = 6057602589533840889L;

    private int status;

    public BaseException() {
    }

    public BaseException(String message) {
        super(message);
    }

    public BaseException(String messageTemplate, Object... params) {
        super(StrUtil.format(messageTemplate, params));
    }

    public BaseException(Throwable throwable) {
        super(throwable);
    }

    public BaseException(String message, Throwable throwable) {
        super(message, throwable);
    }

    public BaseException(int status, String message) {
        super(message);
        this.status = status;
    }

    public BaseException(int status, Throwable throwable) {
        super(throwable);
        this.status = status;
    }

    public BaseException(int status, String message, Throwable throwable) {
        super(message, throwable);
        this.status = status;
    }

    public int getStatus() {
        return this.status;
    }

}
