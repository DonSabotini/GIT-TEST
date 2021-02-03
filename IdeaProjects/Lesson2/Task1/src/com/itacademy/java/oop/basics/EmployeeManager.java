package com.itacademy.java.oop.basics;

import java.util.Date;

public class EmployeeManager {

    public static void main(String[] args) {
        Employee a = new Employee("Domantas", "Kemesis", Type.FULLTIME);
        Employee b = new Employee("Dom", "Kem", Type.PARTTIME, new Date(), 1200.00d, Position.BOSS );
        Employee c = new Employee();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}
