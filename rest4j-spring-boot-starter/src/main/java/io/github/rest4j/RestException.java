package io.github.rest4j;

import lombok.Getter;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.server.ResponseStatusException;

import java.util.UUID;

/**
 * 基础异常
 *
 * @see org.springframework.web.server.ResponseStatusException
 * @since 0.1.3
 */
@Getter
abstract class RestException extends ResponseStatusException {

    private final int code;
    private final String eid;

    protected RestException(HttpStatusCode status, int code, String message, Throwable cause) {
        super(status, message, cause, null, new Object[]{message});
        this.code = code;
        this.eid = UUID.randomUUID().toString().toUpperCase();
        this.getBody().setProperty("code", this.code);
        this.getBody().setProperty("eid", this.eid);
    }

    @Override
    public String getMessage() {
        return this.getStatusCode() + (" CODE:" + this.getCode()) +
                (this.getReason() != null ? " MESSAGE:\"" + this.getReason() + "\"" : "") +
                " EID:" + this.getEid();
    }
}
