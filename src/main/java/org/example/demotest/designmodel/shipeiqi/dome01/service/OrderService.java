package org.example.demotest.designmodel.shipeiqi.dome01.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OrderService {

    private Logger logger  = LoggerFactory.getLogger(OrderService.class);

    public long queryOrderCount(String UserId){
        logger.info("查询用户{}的订单数量",UserId);
        return 100L;
    }
}
