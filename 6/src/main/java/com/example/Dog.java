package com.example;

public class Dog {
    public String name;
    protected int age;
    private String breed;
    String color;

    public Dog(String name, int age, String breed, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void bark() {
        System.out.println(name + " лает!");
    }

    public void info() {
        System.out.println("Имя: " + name + ", Возраст: " + age +
                ", Порода: " + breed + ", Окрас: " + color);
    }
}
