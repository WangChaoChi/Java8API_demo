package com.wcc.stream;

import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;

/**
 * @author wangcc
 * @decription:
 * @date 2018/4/30 12:30
 */
public class StatDemo1 {
    public static void main(String[] args) {
        double totalIncome = Persion.persions().stream()
                .collect(Collectors.summingDouble(Persion::getIncome));
        System.out.println(totalIncome);
        double avgIncome = Persion.persions().stream()
                .collect(Collectors.averagingDouble(Persion::getIncome));
        System.out.println(avgIncome);
        DoubleSummaryStatistics incomeStats = Persion.persions().stream()
                .collect(Collectors.summarizingDouble(Persion::getIncome));
        System.out.println(incomeStats.getAverage());
        System.out.println(incomeStats.getCount());
        System.out.println(incomeStats.getMax());
        System.out.println(incomeStats.getMin());
        System.out.println(incomeStats.getSum());

    }
}
