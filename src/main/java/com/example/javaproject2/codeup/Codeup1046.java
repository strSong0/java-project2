package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long iVal1 = sc.nextLong();
        long iVal2 = sc.nextLong();
        long iVal3 = sc.nextLong();

        long sum = iVal1 + iVal2 + iVal3;
        System.out.println(sum);
        System.out.printf("%.1f", (float)(sum)/3);
    }
}
