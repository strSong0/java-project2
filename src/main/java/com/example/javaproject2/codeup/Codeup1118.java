package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int under = sc.nextInt();
        int high = sc.nextInt();

        float area = (float) under * high / 2;

        System.out.printf("%.1f", area);
    }
}
