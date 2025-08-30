package org.example.demotest;

import org.example.demotest.designmodel.zhuangshiqi.dome01.LoginSsoDecorator;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemotestApplicationTests {

    @Test
    public void test_LoginSsoDecorator() {
        LoginSsoDecorator ssoDecorator = new LoginSsoDecorator();
        String request = "1successhuahua";
        boolean success = ssoDecorator.preHandle(request, "ewcdqwt40liuiu",
                "t");
        System.out.println("登录校验：" + request + (success ? " 放⾏" : " 拦截"));
    }

}
