package com.example;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("BMW");
        Vehicle bicycle = new Bicycle("Stels");

        car.move();
        bicycle.move();
    }
}
