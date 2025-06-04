package io.github.rest4j;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 全局自动配置 - 配置项
 *
 * @see io.github.rest4j.RestAutoConfiguration
 * @since 0.1.3
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "rest")
public class RestProperties {
    /**
     * 是否开启默认异常处理
     */
    private Boolean defaultExceptionHandler = false;
}
