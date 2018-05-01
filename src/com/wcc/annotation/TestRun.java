package com.wcc.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author wangcc
 * @decription:
 * @date 2018/4/6 16:50
 */
public class TestRun {
    public static void main(String[] args) {
        Class<TestAnnotation> c = TestAnnotation.class;
        Method[] ms = c.getDeclaredMethods();
        for (Method method : ms) {
//            method.getAnnotations(); //得到方法上修饰的注解
            //遍历test是不是被@Test修饰
            if (method.isAnnotationPresent(Test.class)) {
                //得到方法上面的@Test注解
                Test test = method.getAnnotation(Test.class);
                int num = test.num();//得到注解中的num()属性
                if (num < 10) {//如果num小于10进入下次循环
                    continue;
                }
                try {
                    //调用方法
                    method.invoke(c.newInstance());
                } catch (IllegalAccessException |
                        InvocationTargetException |
                        InstantiationException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
