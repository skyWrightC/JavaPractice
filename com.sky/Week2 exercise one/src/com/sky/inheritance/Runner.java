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

        float totalBill = 0;

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);

            if (vehicle instanceof Car) {
                Car c1 = (Car) vehicle;
                totalBill += c1.isBootOpen() ? 100 : 50;
            } else if (vehicle instanceof Lorry) {
                totalBill += ((Lorry) vehicle).trailerAttached ? 10_000 * vehicle.getNumDoors() : 1_000;
            } else if (vehicle instanceof Plane) {
                totalBill += ((Plane) vehicle).isPropeller() ? 500 : 1_000;

            }
        }

        System.out.println("Total bill: " + totalBill);
    }
}
