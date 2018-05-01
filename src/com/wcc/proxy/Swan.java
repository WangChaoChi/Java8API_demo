package com.wcc.proxy;

/**
 * @author wangcc
 * @decription: 业务逻辑类，也是被代理的类
 * @date 2018/4/10 16:11
 */
public class Swan implements Flying {
    @Override
    public void m1() {
        System.out.println("方法一");
    }

    @Override
    public int m2(int num) {
        System.out.println("方法二");
        return num;
    }
}
