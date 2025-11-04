package com.example;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("BMW");
        Car car1 = new Car("");
        Vehicle bicycle = new Bicycle("Stels");


        car.move();
        bicycle.move();
        car1.printInfo();

    }

}
