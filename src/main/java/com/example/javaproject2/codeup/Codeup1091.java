package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long start = sc.nextInt();
        long multi = sc.nextInt();
        long add = sc.nextInt();
        long where = sc.nextInt();

        long res = start;

        for (int i = 1; i < where ; i++) {
            res = res * multi + add;

        }
        System.out.println(res);
    }
}
