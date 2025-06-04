package io.github.rest4j;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * 异常处理器
 *
 * @see io.github.rest4j.RestAutoConfiguration
 * @since 0.1.3
 */
public abstract class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<Object> handleBadRequestException(BadRequestException ex, WebRequest request) {
        logger.warn(request.getDescription(true), ex);
        return super.handleExceptionInternal(ex, null, ex.getHeaders(), ex.getStatusCode(), request);
    }

    @ExceptionHandler(InternalServerErrorException.class)
    public ResponseEntity<Object> handleInternalServerErrorException(InternalServerErrorException ex,
                                                                     WebRequest request) {
        logger.error(request.getDescription(true), ex);
        return super.handleExceptionInternal(ex, null, ex.getHeaders(), ex.getStatusCode(), request);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Object> handleExceptionInternal(Exception ex, WebRequest request) {
        return this.handleExceptionInternal(ex, null, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR, request);
    }

    @Override
    public ResponseEntity<Object> handleExceptionInternal(Exception ex, Object body, HttpHeaders headers,
                                                          HttpStatusCode statusCode, WebRequest request) {
        RestException wrapper;
        if (statusCode.is4xxClientError()) {
            wrapper = new BadRequestException(ex);
            logger.warn(request.getDescription(true), wrapper);
        } else {
            wrapper = new InternalServerErrorException(ex);
            logger.error(request.getDescription(true), wrapper);
        }
        return super.handleExceptionInternal(wrapper, null, wrapper.getHeaders(),
                wrapper.getStatusCode(), request);
    }
}
