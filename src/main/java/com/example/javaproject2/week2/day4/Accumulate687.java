package com.example.javaproject2.week2.day4;

public class Accumulate687 {
    public static void main(String[] args) {
        int num = 687;
        int answer = 0;

        //나머지를 먼저구하고
        answer = answer + (num % 10);
        System.out.printf("answer:%d\n", answer);


        //그 뒤에 몫을 구해야합니다.

        num = num / 10;


        answer = answer + num % 10;
        System.out.printf("answer:%d\n", answer);
        num = num / 10;
        answer = answer + num % 10;
        System.out.printf("answer:%d\n", answer);
    }
}
