package com.example;

public class Car implements Vehicle, Novzd {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public void move() {
        System.out.println("Машина " + model + " едет по дороге");
    }

    @Override
    public void metod() {
        System.out.println("Метод новый");
    }
}
