package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1079 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            char cVal = sc.next().charAt(0);

            if (cVal == 'q') {
                break;
            }
            System.out.println(cVal);
        }
        System.out.println('q');
    }
}
