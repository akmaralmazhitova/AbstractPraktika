package com.company;

public abstract class Air extends Vehicle {
    public Air() {
    }

    public Air(String name, String color, String type, int speed) {
        super(name, color, type, speed);
    }

    @Override
    public void trans() {
        System.out.println("Trasportation by air");
    }
    public abstract void planeTrans();
    public abstract void ballonTrans();

}
