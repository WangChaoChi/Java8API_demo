package com.wcc.test;

import java.lang.reflect.Field;

public class Main {
    /**
     * 为什么1000 ==1000为false，100 ==100为true
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        /*Integer a = 1000, b = 1000;
        System.out.println(a == b);
        Integer c = 100, d = 100;
        System.out.println(c == d);*/

        Class cache = Integer.class.getDeclaredClasses()[0]; //1
        Field myCache = cache.getDeclaredField("cache"); //2
        myCache.setAccessible(true);//3
        Integer[] newCache = (Integer[]) myCache.get(cache); //4
        newCache[132] = newCache[133]; //5
        int a = 2;
        int b = a + a;
        System.out.printf("%d + %d = %d", a, a, b); //
    }
}
