package com.company;

public abstract class Terrestrial extends Vehicle {
    public Terrestrial() {
    }

    public Terrestrial(String name, String color, String type, int speed) {
        super(name, color, type, speed);
    }

    @Override
    public void trans() {
        System.out.println("Transportation by earth");
    }
    public abstract void withWheel();
    public abstract void electrical();

}
