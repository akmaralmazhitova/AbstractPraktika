package com.company;

public abstract class Vehicle {
    private String name;
    private String color;
    private String type;
    private int speed;

    public Vehicle(){};

    public Vehicle(String name, String color, String type, int speed) {
        this.name = name;
        this.color = color;
        this.type = type;
        this.speed = speed;
    }

    public abstract void trans();
}
