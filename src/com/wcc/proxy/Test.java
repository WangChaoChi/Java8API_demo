package com.wcc.proxy;

import java.lang.reflect.Proxy;

/**
 * @decription: 测试
 */
public class Test {
    public static void main(String[] args) {
        Swan swan = new Swan();
        //获取代理
        Flying flying = (Flying) Proxy.newProxyInstance(Test.class.getClassLoader(),
                swan.getClass().getInterfaces(),
                new MyLog(swan));
        flying.m1();
        System.out.println("--------------------------");
        int result = flying.m2(100);
        System.out.println(result);
    }
}
