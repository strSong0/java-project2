package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int iVal = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= iVal; i++) {
            sum += i;

            if(sum >= iVal){
                System.out.println(i);
                break;
            }
        }
    }
}
