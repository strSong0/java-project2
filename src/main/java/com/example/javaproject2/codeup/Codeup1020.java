package com.example.javaproject2.codeup;

import java.util.Scanner;

public class Codeup1020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sVal = sc.nextLine();
        String[] residentNum = sVal.split("[-]");

        int firstResidentNum = Integer.parseInt(residentNum[0]);
        int lastResidentNum = Integer.parseInt(residentNum[1]);

        System.out.printf("%06d%07d", firstResidentNum, lastResidentNum);
    }
}
