package com.company;

public class Steamer extends Aqueous{
    public Steamer() {
    }

    public Steamer(String name, String color, String type, int speed) {
        super(name, color, type, speed);
    }

    @Override
    public void underWater() {
        System.out.println("under water");
    }

    @Override
    public void overWater() {
        System.out.println(" over water");
    }

    public void wihtCapitan(){
        System.out.println("Steamer with reel capitan");
    }
    public void open(){
        System.out.println("Steamer open ");
    }
}
