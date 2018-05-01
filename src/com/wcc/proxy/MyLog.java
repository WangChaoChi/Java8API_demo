package com.wcc.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @decription: Java中提供的动态代理
 */
public class MyLog implements InvocationHandler {

    private Object target;//要代理的目标

    //使用构造方法传入要代理的目标
    public MyLog(Object target) {
        this.target = target;
    }

    /**
     * 横切面逻辑
     *
     * @param proxy  产生代理的实例
     * @param method 需要代理的方法
     * @param args   方法参数
     * @return 代理方法的返回值
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        //方法执行之前做的事情
        System.out.println("Method before....");
        //使用反射执行方法
        Object result = method.invoke(target, args);
        //方法执行之后要做的事情
        System.out.println("Method after....");
        return result;
    }
}
