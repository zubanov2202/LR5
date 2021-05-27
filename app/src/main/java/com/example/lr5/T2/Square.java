package com.example.lr5.T2;

public class Square extends Shape {
    protected double side;


    public Square() {
        side = 5.4;
    }

    public Square (double side, String color, boolean filled){
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double Side) {
        this.side = side;
    }

    public void setWidth(double side) {
        this.side = side;
    }

    public void setLength(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "The square with color: " + getColor() + ", him sides: " + side + ", Area: " + getArea() +
                ", Perimeter: " + getPerimeter() + ", filled status: " + isFilled();
    }
}
