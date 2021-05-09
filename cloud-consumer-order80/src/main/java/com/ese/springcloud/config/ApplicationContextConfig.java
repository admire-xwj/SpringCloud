package com.ese.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author XWJ
 * @version 1.0.0
 * @ClassName ApplicationContextConfig.java
 * @Description TODO
 * @createTime 2021年05月09日 20:06:00
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }
}
