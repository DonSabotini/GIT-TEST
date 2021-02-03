package com.itacademy.java.oop.basics;

public class Square {
    private double length;
    private double width;

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Square() {
        this.length = 5;
        this.width = 5;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public double calcuatePerimeter(){
        return (length + width) * 2;
    }
    public double area(){
        return length * width;
    }
}
