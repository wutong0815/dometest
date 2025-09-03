package org.example.demotest.designmodel.gonngchang.dome02.store;

import java.util.Map;

public interface ICommodity {
    /**
     *
     * @param uId 用户id
     * @param commodityId 商品id
     * @param bizId 业务id
     * @param extMap 扩展参数
     * @throws Exception
     */
    void sendCommodity(String uId, String commodityId, String bizId, Map<String, String> extMap) throws Exception;
}
