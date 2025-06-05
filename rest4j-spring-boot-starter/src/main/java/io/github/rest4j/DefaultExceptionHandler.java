package io.github.rest4j;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 * 默认异常处理器
 *
 * @see io.github.rest4j.RestExceptionHandler
 * @see io.github.rest4j.RestProperties
 * @since 0.1.3
 */
@ConditionalOnProperties({
        @ConditionalOnProperty(prefix = "rest4j", name = "default-exception-handler", havingValue = "true",
                matchIfMissing = true),
})
@ConditionalOnMissingBean({ResponseEntityExceptionHandler.class,})
@RestControllerAdvice
public class DefaultExceptionHandler extends RestExceptionHandler {
}
