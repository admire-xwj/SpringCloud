package com.ese.springcloud.controller;

import com.ese.springcloud.entities.CommonResult;
import com.ese.springcloud.entities.Payment;
import com.ese.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author XWJ
 * @version 1.0.0
 * @ClassName PaymentController.java
 * @Description TODO
 * @createTime 2021年05月08日 23:30:00
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Resource
    private DiscoveryClient discoveryClient;


    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("插入结果:" + result);
        if (result > 0) {
            return new CommonResult(200, "插入数据库成功,serverPort:" + serverPort, result);

        } else {
            return new CommonResult(444, "插入数据库失败,serverPort:" + serverPort, null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("*****查询结果:" + payment);
        if (payment != null) {
            return new CommonResult(200, "查询成功,serverPort:" + serverPort, payment);
        } else {
            return new CommonResult(444, "没有对应记录,查询ID：" + id + ",serverPort:" + serverPort, null);
        }
    }

    /**
     * 获得服务的信息
     *
     * @return
     */
    @GetMapping(value = "/payment/discovery")
    public Object discovery() {
        //方法一
        List<String> servicesList = discoveryClient.getServices();
        servicesList.forEach(element -> {
            log.info("------element:" + element);
        });
        //方法二  一个微服务下的全部服务名称
        List<ServiceInstance> instancesList = discoveryClient.getInstances("CLOUD-PROVIDER-SERVICE");
        instancesList.forEach(instance -> {
            log.info("-------instance:"+instance.getServiceId() + "\t" + instance.getHost() + "\t" + instance.getPort() + "\t" + instance.getUri());
        });

        return this.discoveryClient;
    }

}
