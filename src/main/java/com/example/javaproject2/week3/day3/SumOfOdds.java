package com.example.javaproject2.week3.day3;

public class SumOfOdds {
    public static void main(String[] args) {
        int sumOfOdd = 0;
        for (int i = 1; i < 10; i+=2) {
            if(i % 2 !=0){
                sumOfOdd += 1;
            }
        }
        System.out.println(sumOfOdd);
    }
}
