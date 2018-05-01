package com.wcc.annotation;

/**
 * @author wangcc
 * @decription:
 * @date 2018/4/6 16:47
 */
public class TestAnnotation {

    @Test(num = 8)
    public void testAdd(){
        System.out.println("Hello Add");
    }

    @Test(num = 12)
    public void testDiv(){
        System.out.println("Hello Div");
    }
}
