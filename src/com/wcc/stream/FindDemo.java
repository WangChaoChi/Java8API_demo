package com.wcc.stream;

import java.util.Optional;

/**
 * @author wangcc
 * @decription:
 * @date 2018/4/30 18:04
 */
public class FindDemo {
    public static void main(String[] args) {
        Optional<Persion> o1 = Persion.persions().stream().findAny();
        if (o1.isPresent()) {
            Persion persion =o1.get();
            System.out.println(persion);
        }

        Optional<Persion> o2 = Persion.persions().stream()
                .filter(Persion::isFeMale).findFirst();
        if (o2.isPresent()) {
            System.out.println(o2.get());
        }
    }
}
