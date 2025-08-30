package org.example.demotest.designmodel.shipeiqi.dome01.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class POPOrderService {

    private Logger logger  = LoggerFactory.getLogger(OrderService.class);

    public boolean isFirstOrder(String userId){
        logger.info("查询用户{}的订单数量",userId);
        return true;
    }
}
