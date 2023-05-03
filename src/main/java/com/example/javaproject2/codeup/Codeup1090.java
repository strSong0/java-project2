package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1090 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long start = sc.nextInt();
        long multi = sc.nextInt();
        long where = sc.nextInt();

        long sum = start;

        for (int i = 1; i < where ; i++) {
            sum *= multi;

        }
        System.out.println(sum);
    }
}
