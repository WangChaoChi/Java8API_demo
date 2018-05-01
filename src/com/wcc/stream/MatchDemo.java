package com.wcc.stream;

/**
 * @author wangcc
 * @decription:
 * @date 2018/4/30 17:57
 */
public class MatchDemo {
    public static void main(String[] args) {
        boolean b1 = Persion.persions().stream().allMatch(Persion::isMale);
        System.out.println(b1);

        boolean b2 = Persion.persions().stream()
                .anyMatch(persion -> persion.getBirthDate().getYear() == 1991);
        System.out.println(b2);

        boolean b3 = Persion.persions().stream()
                .noneMatch(persion -> persion.getIncome() > 6000);
        System.out.println(b3);
    }
}
