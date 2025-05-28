package io.github.rest4j.core.exception;

import org.springframework.http.HttpStatus;

/**
 * 基础异常 400
 *
 * @since 1.0
 */
public class BadRequestException extends RestException {

    BadRequestException(Throwable cause) {
        this(1, "请求无效", cause);
    }

    protected BadRequestException(int code, String message, Throwable cause) {
        super(HttpStatus.BAD_REQUEST, code, message, cause);
    }
}
