package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1024 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sVal = sc.nextLine();

        String[] sArr = sVal.split("");

        for(int i =0; i < sVal.length(); i++){
            System.out.print("'"+ sArr[i] + "'\n");
        }
    }
}
