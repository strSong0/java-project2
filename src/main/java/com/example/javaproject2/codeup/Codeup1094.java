package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int idx = 0;

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[idx++] = sc.nextInt();
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.printf("%d ", arr[i]);
        }
    }
}
