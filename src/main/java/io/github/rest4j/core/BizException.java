package io.github.rest4j.core;

import io.github.rest4j.core.exception.BadRequestException;

/**
 * 业务异常
 *
 * @since 1.0
 */
public class BizException extends BadRequestException {

    private static final int defaultCode = 10000;

    private static final String defaultMessage = "业务处理失败";

    public BizException() {
        super(defaultCode, defaultMessage, (Throwable) null);
    }

    public BizException(int code) {
        super(Math.max(code, defaultCode), defaultMessage, (Throwable) null);
    }

    public BizException(String message) {
        super(defaultCode, message, (Throwable) null);
    }

    public BizException(int code, String message) {
        super(Math.max(code, defaultCode), message, (Throwable) null);
    }

    public BizException(Throwable cause) {
        super(defaultCode, defaultMessage, cause);
    }

    public BizException(int code, Throwable cause) {
        super(Math.max(code, defaultCode), defaultMessage, cause);
    }

    public BizException(String message, Throwable cause) {
        super(defaultCode, message, cause);
    }

    public BizException(int code, String message, Throwable cause) {
        super(Math.max(code, defaultCode), message, cause);
    }

    public BizException(BizError bizError) {
        super(Math.max(bizError.getCode(), defaultCode), bizError.getMessage(), (Throwable) null);
    }

    public BizException(BizError bizError, Throwable cause) {
        super(Math.max(bizError.getCode(), defaultCode), bizError.getMessage(), cause);
    }
}
