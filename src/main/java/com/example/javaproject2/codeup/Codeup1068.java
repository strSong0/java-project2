package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1068 {
    public static void main(String args[]){
        int a;

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if(a>=90 && a<=100){
            System.out.println("A");
        }if(a>=70 && a<=89){
            System.out.println("B");
        }if(a>=40 && a<=69){
            System.out.println("C");
        }
        if(a<=39 && a>=0){
            System.out.println("D");
        }
    }
}
