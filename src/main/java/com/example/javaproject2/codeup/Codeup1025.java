package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String iVal = sc.nextLine();

        String[] arr = iVal.split("");

        System.out.println("["+ Integer.parseInt(arr[0])*10000 + "]");
        System.out.println("["+ Integer.parseInt(arr[1])*1000 + "]");
        System.out.println("["+ Integer.parseInt(arr[2])*100 + "]");
        System.out.println("["+ Integer.parseInt(arr[3])*10 + "]");
        System.out.println("["+ Integer.parseInt(arr[4])*1 + "]");
    }
}
