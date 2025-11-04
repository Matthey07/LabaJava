package com.example;

public class Bicycle extends Vehicle {

    public Bicycle(String model) {
        super(model);
    }

    @Override
    public void print() {

    }

    @Override
    public void move() {
        System.out.println("Велосипед " + model + " движется по велодорожке ");
    }
    print info;
}
