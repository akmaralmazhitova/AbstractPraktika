package com.company;

public abstract class Aqueous extends Vehicle{
    public Aqueous() {
    }

    public Aqueous(String name, String color, String type, int speed) {
        super(name, color, type, speed);
    }

    @Override
    public void trans() {
        System.out.println("Transportation by water ");
    }
    public abstract void underWater();
    public abstract void overWater();
}
