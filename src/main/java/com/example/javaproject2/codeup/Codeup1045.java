package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1045 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int iVal1 = sc.nextInt();
    int iVal2 = sc.nextInt();

    System.out.println(iVal1 + iVal2);
    System.out.println(iVal1 - iVal2);
    System.out.println(iVal1 * iVal2);
    System.out.println(iVal1 / iVal2);
    System.out.println(iVal1 % iVal2);

    double ival1double = (double) iVal1;
    System.out.printf("%.2f" , ival1double / iVal2);
    }
}
