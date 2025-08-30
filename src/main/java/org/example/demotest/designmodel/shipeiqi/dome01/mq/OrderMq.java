package org.example.demotest.designmodel.shipeiqi.dome01.mq;

import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
/**
 * 订单消息
 */
public class OrderMq{
    /**
     * 用户id
     */
    private String uid;

    /**
     * 商品id
     */
    private String sku;

    /**
     * 订单id
     */
    private String orderId;

    /**
     * 订单创建时间
     */
    private Date createOrderTime;

}
