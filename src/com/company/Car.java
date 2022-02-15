package com.company;

public class Car extends Terrestrial{
    public Car() {
    }

    public Car(String name, String color, String type, int speed) {
        super(name, color, type, speed);
    }

    @Override
    public void withWheel() {
        System.out.println("by wheel");
    }

    @Override
    public void electrical() {
        System.out.println("by electrik");
    }
     public void highSpeedy(){
         System.out.println("high speedy");
     }
     public void comfort(){
         System.out.println("high comfort");
     }
}
