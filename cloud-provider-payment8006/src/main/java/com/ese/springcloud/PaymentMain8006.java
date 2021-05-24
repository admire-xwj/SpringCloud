package com.ese.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author XWJ
 * @version 1.0.0
 * @ClassName PaymentMain8002.java
 * @Description TODO
 * @createTime 2021年05月19日 22:56:00
 */
//exclude= {DataSourceAutoConfiguration.class}  表示不需要配置数据库即可启动
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
public class PaymentMain8006 {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMain8006.class, args);
    }
}
