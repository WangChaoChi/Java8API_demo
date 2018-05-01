package com.wcc.stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author wangcc
 * @decription:
 * @date 2018/4/26 13:18
 */
public class StreamDemo3 {
    public static void main(String[] args) {
        /*List<String> lights = Arrays.asList("亮", "亮", "亮", "亮", "亮", "亮", "亮", "亮", "亮", "亮");
        lights=lights.stream().map(n -> "灭").collect(Collectors.toList());
        System.out.println(lights);*/

        /*int num = Stream.of(1, 2, 3, 4, 5, 6).peek(n -> System.out.println("before"+n))
                .filter(n -> n % 2 == 1).peek(n -> System.out.println("after"+n))
                .reduce(0, Integer::sum);
        System.out.println(num);*/

//        Persion.persions().stream().map(Persion::getName).forEach(System.out::println);
//        IntStream.range(1,5).map(n -> n*n).forEach(System.out::println);
//Persion.persions().stream().filter(Persion::isMale).map(Persion::getName).forEach(System.out::println);
//Persion.persions().stream().filter(p -> p.getIncome()>5000).map(Persion::getName).forEach(System.out::println);
//    Stream.of(1,2,6,4,4,2,5,3,6).distinct().sorted().forEach(System.out::println);
//    Stream.of(4,2,6,4,1,2,5,3,6).distinct().sorted().skip(2).forEach(System.out::println);
        Optional sum = Persion.persions().stream().map(Persion::getIncome).reduce(Double::sum);
        if (sum.isPresent()) {
            System.out.println(sum.orElse("没有钱"));
        }
        double sum2 = Persion.persions().stream().map(Persion::getIncome).reduce(0D, Double::sum);
        System.out.println(sum2);
    }
}
