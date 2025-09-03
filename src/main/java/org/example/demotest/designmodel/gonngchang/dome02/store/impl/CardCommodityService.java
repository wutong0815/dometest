package org.example.demotest.designmodel.gonngchang.dome02.store.impl;

import net.minidev.json.JSONObject;
import org.example.demotest.designmodel.gonngchang.dome02.store.ICommodity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public class CardCommodityService implements ICommodity {

    private final Logger logger = LoggerFactory.getLogger(CardCommodityService.class);
    public void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception {
        logger.info("请求参数[优惠券] => uId：{} commodityId：{} bizId：{} extMap：{}", uId, commodityId, bizId, JSONObject.toJSONString(extMap));
    }
}
