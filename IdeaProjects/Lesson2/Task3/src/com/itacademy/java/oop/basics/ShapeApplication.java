package com.itacademy.java.oop.basics;

public class ShapeApplication {

    public static void main(String[] args) {
	    Square a = new Square();
        Square b = new Square(10,25);
        Square c = new Square(-10,25);
        Square d = new Square(10,-25);
        Square e = new Square(0,25);
        Square f = new Square(2,2);
        Square array[] = {a,b,c,d,e,f};
        checkSquares(array);
    }
    public static void checkSquares(Square array[]){
        for(Square s : array)
            if (s.getWidth() <=0 )
                System.out.println("Invalid shape width is " + s.getWidth());
            else if (s.getLength() <=0 )
                System.out.println("Invalid shape length is " + s.getLength());
            else
                System.out.println("Valid shape length. Perimeter: " + s.calcuatePerimeter() + ". Area: " + s.area());

    }
}
