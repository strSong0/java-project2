package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1095 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] arr = new int[size];
        int idx = 0;

        for (int i = 0; i < size; i++) {
            arr[idx++] = sc.nextInt();
        }

        int min = arr[0];
        for (int i = 1; i < size; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.printf("%d", min);
    }
}
