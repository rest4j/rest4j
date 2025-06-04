package io.github.rest4j;

import org.springframework.http.HttpStatus;

/**
 * 基础异常 - HTTP400
 *
 * @see io.github.rest4j.RestException
 * @since 0.1.3
 */
public class BadRequestException extends RestException {

    BadRequestException(Throwable cause) {
        this(1, "请求无效", cause);
    }

    protected BadRequestException(int code, String message, Throwable cause) {
        super(HttpStatus.BAD_REQUEST, code, message, cause);
    }
}
