package com.example.javaproject2.week2.day4;

public class CheckWhetherAdult {
    public static void main(String[] args) {
        int userAge = 31;
        boolean isAdult = userAge >= 18; // 만 18세 이상
        System.out.printf("미성년자입니까? %b", !isAdult);
    }
}
