package com.sky.inheritance.derived;

import com.sky.inheritance.base.Vehicle;

public class RaceCar extends Vehicle {

    private boolean turbo;

    public RaceCar(String colour, boolean bootOpen, boolean turbo) {
        super(colour);
        this.turbo = turbo;
    }
}
