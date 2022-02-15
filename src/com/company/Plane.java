package com.company;

public class Plane extends Air{
    public Plane() {
    }

    public Plane(String name, String color, String type, int speed) {
        super(name, color, type, speed);
    }

    @Override
    public void planeTrans() {
        System.out.println("by Plane");
    }

    @Override
    public void ballonTrans() {
        System.out.println("by Balloon");
    }
    public void change(){
        System.out.println("trasportation realized with change");
    }
    public void wihtoutChange(){
        System.out.println("tranportation realized without change");
    }
}
