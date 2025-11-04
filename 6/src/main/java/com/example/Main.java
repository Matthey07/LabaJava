package com.example;

public class Main {
    public static void main(String[] args) {


        Wing wing = new Wing();
        Chassis chassis = new Chassis();
        Engine engine = new Engine();

        Airplane airplane = new Airplane(wing, chassis, engine);
        airplane.setRoute("Минск - Москва");
        airplane.printRoute();
        airplane.fly();

        System.out.println("\n==============================\n");


        Dog dog = new Dog("Шарик", 3, "Овчарка", "черный");
        dog.info();
        dog.bark();


        System.out.println("Порода собаки: " + dog.getBreed());
    }
}
