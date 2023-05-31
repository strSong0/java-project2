package com.example.javaproject2.week6;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override

    public double calculateArea() {
        double a = 2 * 3.14 * radius;

        return a;
    }
}
