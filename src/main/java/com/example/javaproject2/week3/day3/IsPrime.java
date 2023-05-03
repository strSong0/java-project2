package com.example.javaproject2.week3.day3;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int factors = 0; // 약수의 개수
        for (int i = 2; i < num; i++) {
            if(num % i == 0) factors++;
        }
        System.out.println(factors == 0 ? "prime": "not prime");
    }
}
