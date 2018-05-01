package com.wcc.stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author wangcc
 * @decription: 将各种数据源转换成Stream
 * @date 2018/4/23 22:43
 */
public class StreamDemo2 {
    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("Jeck", "Tom", "Lily");
        s1.forEach(System.out::println);
        System.out.println("---------------------------");
        Stream s2 = Stream.<String>builder().add("Jeck").add("Tom").build();
        s2.forEach(System.out::println);
        System.out.println("---------------------------");
        IntStream i1 = IntStream.range(1, 6);
        i1.forEach(System.out::println);
        System.out.println("---------------------------");
        IntStream i2 = IntStream.rangeClosed(1, 6);
        i2.forEach(System.out::println);

        Stream empty1 = Stream.empty();
        IntStream empty2 = IntStream.empty();
        System.out.println("---------------------------");

        Stream stream = Stream.iterate(1L, (a) -> a + 2);
        stream.limit(10).forEach(System.out::println);

        Stream.generate(Math::random).limit(5).forEach(System.out::println);

        Arrays.stream(new int[]{1, 2, 3, 4, 5});
        Arrays.stream(new String[]{"东", "西", "南", "北"});

        "aaa bbb".chars().forEach(System.out::println);
        Pattern.compile(",").splitAsStream("aaa,bbb,ccc").forEach(System.out::println);
    }
}
