package com.example;

public class Airplane {
    private Wing wing;
    private Chassis chassis;
    private Engine engine;
    private String route;

    public Airplane(Wing wing, Chassis chassis, Engine engine) {
        this.wing = wing;
        this.chassis = chassis;
        this.engine = engine;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public void printRoute() {
        System.out.println("Маршрут полета: " + route);
    }

    public void fly() {
        System.out.println("Самолет взлетает...");
        engine.start();
        wing.lift();
        chassis.retract();
        System.out.println("Самолет летит по маршруту: " + route);
    }

}
