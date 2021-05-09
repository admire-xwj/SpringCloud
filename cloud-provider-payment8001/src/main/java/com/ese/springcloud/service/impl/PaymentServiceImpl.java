package com.ese.springcloud.service.impl;

import com.ese.springcloud.Dao.PaymentDao;
import com.ese.springcloud.entities.Payment;
import com.ese.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author XWJ
 * @version 1.0.0
 * @ClassName PaymentServiceImpl.java
 * @Description TODO
 * @createTime 2021年05月08日 23:28:00
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
