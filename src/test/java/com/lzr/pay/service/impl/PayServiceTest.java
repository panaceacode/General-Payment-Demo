package com.lzr.pay.service.impl;

import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lzr.pay.PayApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;

public class PayServiceTest extends PayApplicationTests {

    @Autowired
    private PayService payService;

    @Test
    public void create() {
        // BigDecimal.valueOf(0.01) == new BigDecimal("0.01")
        payService.create("592155980", BigDecimal.valueOf(0.01), BestPayTypeEnum.WXPAY_NATIVE);
    }
}