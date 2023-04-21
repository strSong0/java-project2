package com.example.javaproject2.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User song = new User();
        song.name = "송윤석";
        song.phoneNumber = "010 - 1234 - 1234";
        song.age = 27;

        System.out.printf("%s님은 성인입니까? %s\n", song.name, song.isAdult());

    }
}
