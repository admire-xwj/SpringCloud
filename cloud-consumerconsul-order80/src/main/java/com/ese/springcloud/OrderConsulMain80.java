package com.ese.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author XWJ
 * @version 1.0.0
 * @ClassName OrderConsulMain80.java
 * @Description TODO
 * @createTime 2021年05月24日 22:47:00
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class OrderConsulMain80 {

    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMain80.class, args);
    }
}
