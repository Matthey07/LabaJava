package com.example;

public class Triangle extends Shape {
    private double a, b, c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public void draw() {
        System.out.println("Рисуем треугольник. Стороны: "
                + a + ", " + b + ", " + c);
    }
}
