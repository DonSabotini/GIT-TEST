package com.itacademy.java.oop.basics;

import java.util.Date;

public class Employee {


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Type getContract() {
        return contract;
    }

    public Date getContractStartDate() {
        return contractStartDate;
    }

    public Double getSalary() {
        return salary;
    }

    public Position getPosition() {
        return position;
    }

    private String name;
    private String surname;
    private Type contract;

    public Employee(String name, String surname, Type contract, Date contractStartDate, Double salary, Position position) {
        this.name = name;
        this.surname = surname;
        this.contract = contract;                       // •	Use enum where it‘s needed (enum constants must have display values and a method to create enum from display value).
                                                        // specifiškai nenurodyta, kad turi spusdinti display value, bet gal būtų gražu :)
        this.contractStartDate = contractStartDate;
        this.salary = salary;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", contract=" + contract +
                ", contractStartDate=" + contractStartDate +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }

    private Date contractStartDate;                 // būtų gerai turėt kodo struktūros. visi class field vienoj vietoj,
                                                    // konstruktoriai vienoj vietoj, etc.
    private Double salary;
    private Position position;

    public Employee(String name, String surname, Type contract) {
        this.name = name;
        this.surname = surname;
        this.contract = contract;
        this.contractStartDate = contractStartDate; // kadangi nepaduodi variable per konstruktorių - gaunasi,
                                                    // kad priskiri tą pačią reikšmę tam pačiam field. a = a
        this.salary = salary;                       // čia tas pats
        this.position = position;                   // čia tas pats
    }
    public Employee() {
        this.name = name;                           // čia tas pats
        this.surname = surname;                     // čia tas pats
        this.contract = contract;                   // ....
        this.contractStartDate = contractStartDate; // ....
        this.salary = salary;                       // ....
        this.position = position;                   // ....
    }

}
