package com.company;

public class Main {

    public static void main(String[] args) {
        Car cr = new Car("Goblin", "red", "earthly", 1200);
        Plane pl = new Plane("TUU", "white", "air",3000);
        Steamer st = new Steamer("Klermont", "white", "water", 900);

        Vehicle[] vehicles = {new Car(), new Plane(), new Steamer()};
        for (Vehicle res: vehicles) {
            if (res instanceof Car){
                ((Car) res).highSpeedy();
                ((Car) res).comfort();
            } else if (res instanceof Plane){
                ((Plane) res).change();
                ((Plane) res).wihtoutChange();
            } else if(res instanceof Steamer){
                ((Steamer) res).wihtCapitan();
                ((Steamer) res).open();
            }

        }
    }
}
