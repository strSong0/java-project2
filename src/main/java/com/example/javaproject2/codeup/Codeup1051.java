package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int iVal1 = sc.nextInt();
        int iVal2 = sc.nextInt();

        if(iVal1 <= iVal2){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
