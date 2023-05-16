package com.example.javaproject2.week4.day4;

public class ListUser {
    public class User {
        private String name;
        private String phoneNumber;
        private int age;
        private int password;


        public User(String name, String phoneNumber, int age, int password) {
            this.name = name;
            this.phoneNumber = phoneNumber;
            this.age = age;
            this.password = password;

        }

        public String getName() {
            return name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public int getAge() {
            return age;
        }

        public int getPassword() {
            return password;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setPassword(int password) {
            this.password = password;
        }

        boolean isAdult() {
            return age >= 18;
        }
    }
}
