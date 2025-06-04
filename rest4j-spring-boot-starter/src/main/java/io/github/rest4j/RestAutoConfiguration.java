package io.github.rest4j;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties({RestProperties.class,})
public class RestAutoConfiguration implements InitializingBean {

    @Override
    public void afterPropertiesSet() throws Exception {
    }
}

