package com.example.javaproject2.week2.day2;

public class StringEquals {
    public static void main(String[] args) {
        System.out.println("GOLD" == "GOLD");

        String str1 = "Gold";
        String str2 = "G";

        boolean isSame = str1.substring(0, 1) == str2;
        System.out.println(isSame);

    }
}

