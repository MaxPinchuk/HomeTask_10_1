package com.company;

public class Circle {

    double rad;
    double circumference; //длинна окружности
    double square; // площадь
    public String color;

    public Circle(double rad) {
        this.rad = rad;
        square = (rad * rad) * Math.PI;
        circumference = 2*Math.PI * rad;
    }

    public Circle(double rad, String color) {
        this.rad = rad;
        this.color = color;
        square = (rad * rad) * Math.PI;
        circumference = 2*Math.PI * rad;
    }
}