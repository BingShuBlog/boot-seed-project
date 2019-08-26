package com.company.project.core;

/**
 * @author hushaojun
 * @Date :  2019/8/26
 * @Decription :业务异常处理
 */
public class ServiceException extends RuntimeException {
    public ServiceException() {
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
}
