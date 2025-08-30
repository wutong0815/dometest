package org.example.demotest.designmodel.shipeiqi.dome01.mq;


import lombok.Data;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 第三方订单
 */
@Data
@ToString
public class POPOrderDelivered {

    /**
     * 用户id
     */
    private String uid;
    /**
     * 订单id
     */
    private String orderId;

    /**
     * 订单时间
     */
    private Date orderTime;

    /**
     * 商品
     */
    private Date sku;

    /**
     * 商品名称
     */
    private Date skuName;


    private BigDecimal decimal;
}
