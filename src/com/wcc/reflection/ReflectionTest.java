package com.wcc.reflection;

import java.lang.reflect.Array;

/**
 * @author wangcc
 * @decription:
 * @date 2018/4/7 15:27
 */
public class ReflectionTest {
    public static void main(String[] args) {
        //第一种：通过类的class静态属性（字面量）
        Class<String> c = String.class;

        //第二种：通过实例的getClass()方法
        String s = "";
        Class<?> c1 = s.getClass();

        //第三种：类加载器，Class的静态方法forName()方法
        try {
            Class<?> c2 = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        //第二个参数为数组长度，创建一维数组
        int[] num = (int[]) Array.newInstance(int.class, 10);

        //第二个参数为围度，创建二维数组
        int[][] num2 = (int[][]) Array.newInstance(int.class, 3, 5);

    }
}
