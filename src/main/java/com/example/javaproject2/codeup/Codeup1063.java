package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1063 {
    public static void main(String args[]){
        int val1;
        int val2;

        Scanner sc = new Scanner(System.in);
        val1 = sc.nextInt();
        val2 = sc.nextInt();

        System.out.print(val1>val2?val1:val2);
    }
}
