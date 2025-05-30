package io.github.rest4j.core;

/**
 * 业务异常
 *
 * @since 1.0
 */
public interface BizError {

    int getCode();

    String getMessage();
}
