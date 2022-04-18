package com.company;

/**
 * Создание класса с конструктором
 * <p>
 * 1.1 Создать класс Circle. Описать поля: радиус, длинна окружности, площадь, цвет.
 * Создать 2 конструктора, в которые передавать параметры: радиус, и цвет и радиус.
 * <p>
 * 1.2 Параметры площадь и длинна окружности рассчитать в конструкторе на основе радиуса и Pi.
 * Примечание число PI можно взять из класса Math, Math.PI.
 * <p>
 * 1.3 Создать метод main, в котором создать экземпляр класса Circle.
 * Вывести на экран сообщение с данными о длинне окружности, площади и цвета.
 */

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(20, "green");
        System.out.println("Circumference: " + circle.circumference + ", Square: " + circle.square + ", Color: " + circle.color);
    }
}