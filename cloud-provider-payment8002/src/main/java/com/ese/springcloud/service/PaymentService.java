package com.ese.springcloud.service;

import com.ese.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author XWJ
 * @version 1.0.0
 * @ClassName PaymentService.java
 * @Description TODO
 * @createTime 2021年05月08日 23:27:00
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
