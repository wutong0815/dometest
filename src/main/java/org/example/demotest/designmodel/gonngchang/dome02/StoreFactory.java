package org.example.demotest.designmodel.gonngchang.dome02;

import org.example.demotest.designmodel.gonngchang.dome02.store.ICommodity;
import org.example.demotest.designmodel.gonngchang.dome02.store.impl.CardCommodityService;
import org.example.demotest.designmodel.gonngchang.dome02.store.impl.CouponCommodityService;
import org.example.demotest.designmodel.gonngchang.dome02.store.impl.GoodsCommodityService;

public class StoreFactory {

    public ICommodity getCommodityService(Integer commonityType) {
        if (null == commonityType) {
            return null;
        }
        if (1 == commonityType) {
            return new CouponCommodityService();
        }
        if (2 == commonityType) {
            return new GoodsCommodityService();
        }
        if (3 == commonityType) {
            return new CardCommodityService();
        }
        throw new RuntimeException("不存在的商品类型");

    }
}
