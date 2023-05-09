package com.example.javaproject2.week4.day1;

import java.util.Scanner;

public class PyramidStar1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height  = sc.nextInt();

        for (int i = 0; i < height; i++) { //전체루프 0 1 2 3
            for (int j = 0; j < height -i -1; j++) { // 3 2 1 0으로 공백
                System.out.printf(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) { // 2n +1
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
