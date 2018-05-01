package com.wcc.stream;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

/**
 * @author wangcc
 * @decription:
 * @date 2018/4/26 12:10
 */
public class Persion {
    public static enum  Gender{
        MALE, FEMALE
    }
    private int id;
    private String name;
    private double income;
    private LocalDate birthDate;
    private Gender gender;

    public boolean isMale(){
        return this.gender == Gender.MALE;
    }
    public boolean isFeMale(){
        return this.gender == Gender.FEMALE;
    }

    public Persion(int id, String name, double income, LocalDate birthDate, Gender gender) {
        this.id = id;
        this.name = name;
        this.income = income;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public static List<Persion> persions(){
        Persion p1 = new Persion(1,"张三",2000,LocalDate.of(1972,3,2),Gender.MALE);
        Persion p2 = new Persion(2,"李四",5000,LocalDate.of(1982,4,12),Gender.FEMALE);
        Persion p3 = new Persion(3,"王五",8000,LocalDate.of(1984,6,10),Gender.FEMALE);
        Persion p4 = new Persion(4,"赵六",4500,LocalDate.of(1991,8,8),Gender.MALE);
        Persion p5 = new Persion(5,"钱七",10005,LocalDate.of(1962,5,2),Gender.FEMALE);
        return Arrays.asList(p1, p2, p3, p4, p5);
    }

    @Override
    public String toString() {
        return String.format("(%d,%s,%s,%s,%s)",id,name,income,birthDate,gender);
    }
}
