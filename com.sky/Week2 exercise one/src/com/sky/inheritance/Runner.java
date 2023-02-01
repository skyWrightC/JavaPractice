package com.sky.inheritance;

import com.sky.inheritance.base.Vehicle;
import com.sky.inheritance.derived.Car;
import com.sky.inheritance.derived.Lorry;
import com.sky.inheritance.derived.Plane;

public class Runner {

    public Runner() {
        super();
    }

    public static void main(String[] args) {
        Vehicle v = new Vehicle("","","",0,0);
        v.setColour("Blue");
        System.out.println(v);
        v.honkHorn();
        Vehicle c = new Car("Red", false);
        c.honkHorn();
        Vehicle l = new Lorry("Volvo", "fh90","red and blue", 0, 2, true);
        l.honkHorn();

        Vehicle[] vehicles = {c, l, new Plane("White", true)};

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);

            vehicle.honkHorn();

            if (vehicle instanceof Car) {
                Car c1 = (Car) vehicle;
                c1.setBootOpen(true);
            }
        }
    }
}
