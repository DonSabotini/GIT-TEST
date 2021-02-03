package com.itacademu.java.oop.basics;

public class PointApplication {

    public static void main(String[] args) {
        MyPoint point = new MyPoint(3, 4);
        MyPoint secondPoint = new MyPoint(7, 1);
        System.out.println("ToString: " + point);
        point.setX(7);
        System.out.println("Cur X: " + point.getX());
        point.setY(7);
        System.out.println("Cur Y: " + point.getY());
        point.setXY(2, 3);
        int[] array = point.getXY();
        System.out.println("Cur X, Y: " + array[0] + "," + array[1]);
        for (int i : array)
            System.out.println("Cur values: " + i);
        System.out.println("Distance : " + point.distance(8, 12));
        System.out.println("Distance to another point object: " + point.distance(secondPoint));
        System.out.println("Distance to zero: " + point.distance());

    }
}
