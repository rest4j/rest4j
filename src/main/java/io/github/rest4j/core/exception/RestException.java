package io.github.rest4j.core.exception;

import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

/**
 * 基础异常
 *
 * @since 1.0
 */
abstract class RestException extends ResponseStatusException {

    private final int code;

    protected RestException(HttpStatusCode status, int code, String message, Throwable cause) {
        super(status, message, cause, null, new Object[]{message});
        this.code = code;
        this.getBody().setProperty("code", this.code);
    }

    public int getCode() {
        return this.code;
    }

    @Override
    public String getMessage() {
        return this.getStatusCode() + (" CODE" + this.getCode()) +
                (this.getReason() != null ? " \"" + this.getReason() + "\"" : "");
    }
}
