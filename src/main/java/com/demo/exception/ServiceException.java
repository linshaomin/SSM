package com.demo.exception;

import com.demo.base.IResultCode;
import com.demo.base.ResultCode;

public class ServiceException extends Exception {
    private static final long serialVersionUID = -1219262335729891920L;

    public IResultCode getResultCode() {
        return resultCode;
    }

    private final IResultCode resultCode;

    public ServiceException(String message) {
        super(message);
        this.resultCode = ResultCode.FAILURE;
    }

    public ServiceException(IResultCode resultCode) {
        super(resultCode.getMessage());
        this.resultCode = resultCode;
    }
}