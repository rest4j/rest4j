package io.github.rest4j;

import org.springframework.http.HttpStatus;

/**
 * 基础异常 - HTTP500
 *
 * @see io.github.rest4j.RestException
 * @since 0.1.3
 */
public class InternalServerErrorException extends RestException {

    InternalServerErrorException(Throwable cause) {
        this(-1, "内部服务器错误", cause);
    }

    protected InternalServerErrorException(int code, String message, Throwable cause) {
        super(HttpStatus.INTERNAL_SERVER_ERROR, code, message, cause);
    }
}
