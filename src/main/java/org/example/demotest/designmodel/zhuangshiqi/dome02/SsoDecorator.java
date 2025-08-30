package org.example.demotest.designmodel.zhuangshiqi.dome02;

public class SsoDecorator implements HandlerInterceptor{

    private HandlerInterceptor handlerInterceptor;


    private SsoDecorator() {

    }
    public SsoDecorator(HandlerInterceptor handlerInterceptor) {
        this.handlerInterceptor = handlerInterceptor;
    }
    @Override
    public boolean preHandle(String request, String response, Object handler) {
        return handlerInterceptor.preHandle(request, response, handler);
    }
}
