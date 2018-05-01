package com.wcc.stream;

import com.wcc.stream.Persion.Gender;

import java.util.Optional;

/**
 * @author wangcc
 * @decription:
 * @date 2018/4/26 12:38
 */
public class OptionalDemo {
    public static void main(String[] args) {
        Persion persion = new Persion(1, "Tom", 5800, null, Gender.MALE);
//        int year = persion.getBirthDate().getYear();
//        System.out.println(year);

        Optional<String> o1 = Optional.ofNullable(null);
        if (o1.isPresent()) {
            System.out.println(o1.get());
        }
        System.out.println(o1.orElse("default"));
    }
}
