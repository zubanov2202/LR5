package com.example.lr5.T1;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {
        length = 3.2;
        width = 4.5;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    public String toString() {
        return "The Rectangle with color: " + getColor() + ", area: " +  getArea();
    }
}
