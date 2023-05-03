package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1089 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int plus = sc.nextInt();
        int where = sc.nextInt();

        int sum = start;

        for (int i = 1; i < where ; i++) {
            sum += plus;

        }
        System.out.println(sum);
    }
}
