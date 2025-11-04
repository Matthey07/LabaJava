package com.example;

public class Car extends Vehicle implements Novzd{
    @Override
    public void metod() {
        System.out.println("Метод новый");
    }
    public Car(String model) {
        super(model);
    }

    @Override
    public void print() {

    }


    public void  printInfo() {
        System.out.println("Привет");
    }

    @Override
    public void move() {
        System.out.println("Машина " + model + " едет по дороге ");
    }

}
