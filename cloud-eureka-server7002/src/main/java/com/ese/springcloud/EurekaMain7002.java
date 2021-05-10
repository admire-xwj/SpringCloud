package com.ese.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author XWJ
 * @version 1.0.0
 * @ClassName EurekaMain7001.java
 * @Description TODO
 * @createTime 2021年05月09日 23:01:00
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaMain7002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMain7002.class, args);
    }
}
