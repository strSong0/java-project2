package com.example.javaproject2.week4.day1;

public class MutsaMath {
    //약수의 합
    int sumOfFactors(int num) {
        int answer = 1;
        for (int i = 2; i <= num; i++) {
            if(num % i == 0){
                answer += 1;

            }
        }
        return answer;
    }

    void printResult(int num) {
        System.out.printf("%d의 약수의 합은 %d 입니다.\n", num , sumOfFactors(num));
    }

    public static void main(String[] args) {
        MutsaMath mutsaMath = new MutsaMath();
        mutsaMath.printResult(10);
        mutsaMath.printResult(20);
        mutsaMath.printResult(30);
        mutsaMath.printResult(40);

    }
}