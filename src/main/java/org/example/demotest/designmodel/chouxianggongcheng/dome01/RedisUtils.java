package org.example.demotest.designmodel.chouxianggongcheng.dome01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

public class RedisUtils {

    private Logger logger = LoggerFactory.getLogger(RedisUtils.class);

    private Map<String,String> map = new ConcurrentHashMap<>();

    public void set(String key,String value) {
        logger.info("Rides 写入数据 key:{} value:{}",key,value);
        map.put(key,value);
    }

    public String get(String key) {
        logger.info("Redis 读取数据 key:{}",key);
        return map.get(key);
    }

    public void del(String key) {
        logger.info("Redis 删除数据 key:{}",key);
        map.remove(key);
    }

    public void set(String key, String value, Long timeout, TimeUnit timeUnit) {
        logger.info("Redis 写入数据 key:{} value:{} timeout:{} timeUnit:{}",key,value,timeout,timeUnit);
        map.put(key,value);
    }

}
