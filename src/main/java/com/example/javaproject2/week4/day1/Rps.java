package com.example.javaproject2.week4.day1;

public class Rps {

    public String play(int user, int computer){
        if(user == 0 && computer == 1){
            return "win";

        } else if (user == 1 && computer == 2) {
            return "win";

        } else if (user == 2 && computer == 0) {
            return "win";

        } else if (user == computer) {
            return "tie";
        }
        else {
            return "lose";
        }
    }

    public static void main(String[] args) {
        Rps rps = new Rps();
        System.out.println(rps.play(1, 0));
        System.out.println(rps.play(2, 1));
        System.out.println(rps.play(1, 0));

    }
}
