package com.wcc.newtime;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * @author wangcc
 * @decription:
 * @date 2018/4/11 11:09
 */
public class InstantTest {
    public static void main(String[] args) {
       /* System.out.println(Instant.EPOCH);
        System.out.println(Instant.MAX);
        System.out.println(Instant.MIN);
        System.out.println(Instant.now());
        System.out.println(Instant.ofEpochMilli(12525858));
        System.out.println(Instant.ofEpochSecond(12525858));*/

        /*Instant instant= Instant.ofEpochMilli(121212);
        System.out.println(instant.getEpochSecond());
        System.out.println(instant.getNano());*/

        /*Instant instant1 = Instant.now();
        Instant instant2 = instant1.plus(Duration.ofSeconds(100));
        System.out.println(instant2.isAfter(instant1));
        System.out.println(instant1.until(instant2, ChronoUnit.SECONDS));*/

       /* LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = localDate.atTime(localTime);
        LocalDateTime localDateTime2 = localTime.atDate(localDate);
        System.out.println(localDateTime1);
        System.out.println(localDateTime2);*/

       /* LocalDate localDate = LocalDate.of(2018, 4, 15);
        LocalDate localDate1 = LocalDate.parse("2018-04-06");
        System.out.println(localDate);
        System.out.println(localDate1);*/

       /*//LocalDateTime -> Instant
        Instant instant = Instant.from(LocalDateTime.now().atZone(ZoneId.systemDefault()));
        System.out.println(instant);
        System.out.println(Instant.from(ZonedDateTime.now()));

        //Instant -> LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.now(),ZoneId.systemDefault());
        System.out.println(localDateTime);*/

       /* Duration duration = Duration.between(Instant.EPOCH, Instant.now());
        System.out.println(duration);
        Period period = Period.parse("P1Y2M3D");
        Period period1 = Period.of(1, 2, 3);
        System.out.println(period);
        System.out.println(period1);

        LocalDateTime than = LocalDateTime.now().plus(period);
        System.out.println(than);
        System.out.println(Period.ofYears(1));*/

        long days = ChronoUnit.DAYS.between(LocalDate.now(), LocalDate.of(2049, 10, 1));
        System.out.println(days);

    }
}
