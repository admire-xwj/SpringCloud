package com.ese.springcloud.Dao;

import com.ese.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author XWJ
 * @version 1.0.0
 * @ClassName PaymentDao.java
 * @Description TODO
 * @createTime 2021年05月08日 23:10:00
 */
@Mapper
public interface PaymentDao {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);
}
