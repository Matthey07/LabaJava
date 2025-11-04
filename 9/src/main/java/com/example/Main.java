package com.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, Shape> shapes = new HashMap<>();

        shapes.put("Круг", new Circle(5.0));
        shapes.put("Прямоугольник", new Rectangle(4.0, 6.0));
        shapes.put("Треугольник", new Triangle(3.0, 4.0, 5.0));

        System.out.println("Список фигур:");
        for (String name : shapes.keySet()) {
            System.out.println(name);
        }

        System.out.println("\nВызов методов draw():");
        for (Shape shape : shapes.values()) {
            shape.draw();
        }
    }
}
