package com.sky.inheritance.derived;

import com.sky.inheritance.base.Vehicle;

public class Plane extends Vehicle {

    private boolean propeller;

    public Plane(String colour, boolean propeller) {
        super(colour);
        this.propeller = propeller;
    }

    @Override
    public void honkHorn() {
        System.out.println("nyoooooooom");
    }

    public boolean isPropeller() {
        return propeller;
    }

    public void setPropeller(boolean propeller) {
        this.propeller = propeller;
    }
}
