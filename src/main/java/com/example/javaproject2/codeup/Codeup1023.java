package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fVal = sc.nextLine();

        String[] fArr = fVal.split("[.]");
        System.out.println(fArr[0]);
        System.out.println(fArr[1]);
    }
}
