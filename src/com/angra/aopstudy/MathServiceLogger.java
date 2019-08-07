package com.angra.aopstudy;

import com.angra.aopstudy.service.MathService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * 动态代理类
 */
public class MathServiceLogger {
    private MathService service;

    public MathServiceLogger(MathService service) {
        this.service = service;
    }

    /**
     * 获取动态代理的对象
     *
     * @return 返回可生成日志的原对象
     */
    public MathService getLoggerService() {
        MathService proxy = null;
        ClassLoader loader = service.getClass().getClassLoader();
        Class[] interfaces = new Class[]{MathService.class};
        InvocationHandler handler = new InvocationHandler() {
            /**
             *
             * @param proxy     正在返回的代理对象，一般情况下，在invoke方法中都不使用该对象，调用该对象的方法会死循环导致内存溢出的错误
             * @param method    正在被调用的方法
             * @param args      调用方法时，传入的参数
             * @return
             * @throws Throwable
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String methodName = method.getName();
                // 开始时输出日志
                System.out.println("The method " + methodName + " begin with " + Arrays.asList(args));
                // 执行方法
                Object res = method.invoke(service, args);
                // 结束时输出日志
                System.out.println("The method " + methodName + " end with " + res);
                return res;
            }
        };
        proxy = (MathService) Proxy.newProxyInstance(loader, interfaces, handler);
        return proxy;
    }
}
