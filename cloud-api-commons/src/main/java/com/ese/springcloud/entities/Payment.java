package com.ese.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author XWJ
 * @version 1.0.0
 * @ClassName Payment.java
 * @Description TODO
 * @createTime 2021年05月08日 22:55:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {
    private Long id;
    private String serial;
}
