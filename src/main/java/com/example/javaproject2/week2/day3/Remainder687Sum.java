package com.example.javaproject2.week2.day3;

public class Remainder687Sum {
    public static void main(String[] args) {
        int num = 687;
        int a = num % 10;
        num = num / 10;
        int b = num % 10;
        num = num / 10;
        int c = num % 10;
        System.out.println(a + b + c);
    }
}
