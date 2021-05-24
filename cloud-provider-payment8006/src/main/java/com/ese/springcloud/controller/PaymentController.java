package com.ese.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author XWJ
 * @version 1.0.0
 * @ClassName PaymentController.java
 * @Description TODO
 * @createTime 2021年05月19日 23:00:00
 */
@RestController
@Slf4j
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;

    @RequestMapping("/payment/consul")
    public String paymentConsul() {
        return " springcloud with consul: " + serverPort + "\t" + UUID.randomUUID().toString();
    }

}
