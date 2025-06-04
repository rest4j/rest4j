package io.github.rest4j;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 默认异常处理器
 *
 * @see io.github.rest4j.RestExceptionHandler
 * @see io.github.rest4j.RestProperties
 * @since 0.1.3
 */
@ConditionalOnProperty(prefix = "rest", name = "default-exception-handler", havingValue = "true")
@ConditionalOnMissingBean({RestExceptionHandler.class,})
@RestControllerAdvice
public class DefaultExceptionHandler extends RestExceptionHandler {
}
