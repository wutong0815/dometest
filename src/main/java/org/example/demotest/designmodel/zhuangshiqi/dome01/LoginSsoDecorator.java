package org.example.demotest.designmodel.zhuangshiqi.dome01;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LoginSsoDecorator extends SsoInterceptor{

    private static Map<String,String> authmap = new ConcurrentHashMap<>();

    static {
        System.out.println("静态代码块");
        authmap.put("zhangsan", "success");
        authmap.put("lisi", "success");
    }

    @Override
    public boolean preHandle(String request, String response, Object handler) {
        System.out.println("模拟登录校验");
        String ticket = request.substring(1, 8);
        boolean success = ticket.equals("success");

        if (!success) {
            return false;
        }
        String userId = request.substring(8);
        String method = authmap.get(userId);

        return "queryUserInfo".equalsIgnoreCase(method);
    }
}
