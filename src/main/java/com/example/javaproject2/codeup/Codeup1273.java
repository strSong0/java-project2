package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1273 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal = sc.nextInt();

        for (int i = 1; i <= iVal; i++) {
            if(iVal % i == 0){
                System.out.print(i + " ");
            }
        }
    }
}
