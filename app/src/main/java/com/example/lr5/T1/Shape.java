package com.example.lr5.T1;

abstract public class Shape {
    private String color;

    public Shape() {
        color = "Red";
    }

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "The shape with color: " + color;
    }

    abstract public double getArea();
}
