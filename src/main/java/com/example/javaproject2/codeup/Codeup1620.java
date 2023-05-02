package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1620 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        System.out.println(getSingleDigit(iVal));
    }

    public static int getSumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10; // 나머지만을 저장
            num /= 10; // 나머지는 저장되었으니 필요없으니 몫만을 저장
        }
        return sum;
    }
    public static int getSingleDigit(int num) {
        while (num >= 10) {
            num = getSumOfDigits(num);
        }
        return num;
    }
}
