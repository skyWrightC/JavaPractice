package com.sky.Pasta;

public class Pasta {

    private int weight;

    private int height;

    private String shape;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Pasta(int weight, int height, String shape, String name) {
        super();
        this.weight = weight;
        this.height = height;
        this.shape = shape;
        this.name = name;
    }

    public Pasta() {
        this(10, 4, "long", "Penne");
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getShape() {
        return shape;
    }

    public String cookMethod(String method) {
        String message = "our chosen pasta is " + getName() + " pasta. its height is "
                + getHeight() +
                "cm and it's weight is "
                + getWeight() +
                " grams. it's shape is "
                + getShape();

        return message;
    }

}


