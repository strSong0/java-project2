package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1116 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();
        int iVal2 = sc.nextInt();

        System.out.printf("%d+%d=%d\n", iVal, iVal2, iVal + iVal2);
        System.out.printf("%d-%d=%d\n", iVal, iVal2, iVal - iVal2);
        System.out.printf("%d*%d=%d\n", iVal, iVal2, iVal * iVal2);
        System.out.printf("%d/%d=%d\n", iVal, iVal2, iVal / iVal2);
    }
}
