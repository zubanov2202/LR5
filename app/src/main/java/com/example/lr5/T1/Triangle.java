package com.example.lr5.T1;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle() {
        base = 3;
        height = 4;
    }

    @Override
    public double getArea() {
        return 0.5 * (base * height);
    }

    @Override
    public String toString() {
        return "The Triangle with height: " + height + ", base: " + base + ", color: " + getColor()
                + ". Him area equals to: " + getArea();
    }
}
