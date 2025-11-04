package com.example;


public abstract class Vehicle {
    protected String model;

    public Vehicle(String model) {
        this.model = model;
    }

  public abstract void   print();
    public abstract void move();

    public String getModel() {
        return model;
    }
}
