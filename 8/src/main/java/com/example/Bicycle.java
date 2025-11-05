package com.example;
////sssssaaa
public class Bicycle implements Vehicle {
    private String model;

    public Bicycle(String model) {
        this.model = model;
    }

    @Override
    public void move() {
        System.out.println("Велосипед " + model + " движется по велодорожке ");
    }
}
