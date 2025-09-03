package org.example.demotest.designmodel.shipeiqi.dome02;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import static com.sun.management.HotSpotDiagnosticMXBean.ThreadDumpFormat.JSON;


public class MQAdapter {




    public static RebateInfo filter(Map obj, Map<String,String> link) throws NoSuchFieldException, IllegalAccessException, InvocationTargetException {
        // 模拟解析
        org.example.demotest.designmodel.shipeiqi.dome02.RebateInfo rebateInfo = new RebateInfo();
        for (String key : link.keySet()) {
            Object val = obj.get(key);
            RebateInfo.class.getDeclaredField(link.get(key)).set(rebateInfo,val);

        }
        return rebateInfo;
    }
}
