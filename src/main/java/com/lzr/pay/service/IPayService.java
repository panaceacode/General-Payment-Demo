package com.lzr.pay.service;

import com.lly835.bestpay.enums.BestPayTypeEnum;
import com.lly835.bestpay.model.PayResponse;
import com.lzr.pay.pojo.PayInfo;

import java.math.BigDecimal;

public interface IPayService {
    /**
     * 发起/创建订单
     *
     * @param orderId
     * @param amount
     * @return
     */
    PayResponse create(String orderId, BigDecimal amount, BestPayTypeEnum bestPayTypeEnum);

    /**
     * 异步通知
     *
     * @param notifyData
     */
    String asyncNotify(String notifyData);

    /**
     * 查询支付记录（通过订单号）
     *
     * @param orderId
     * @return
     */
    PayInfo queryByOrderId(String orderId);
}
