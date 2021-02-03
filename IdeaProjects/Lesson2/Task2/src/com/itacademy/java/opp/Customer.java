package com.itacademy.java.opp;

import java.util.Arrays;

public class Customer {
    private String name;
    private String surname;
    private int age;
    private int personalNumber;
    private Loan[] userLoans;

    public Customer(String name, String surname, int age, int personalNumber, Loan userLoans[]) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.personalNumber = personalNumber;
        this.userLoans = userLoans;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public int getAge() {
        return age;
    }

    public int getPersonalNumber() {
        return personalNumber;
    }

    public Loan[] getUserLoans() {
        return userLoans;
    }
    public double calculateLoanAmount(){
        double temp = 0;
        for(Loan l : userLoans)
            temp += l.getAmount();
        return temp;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", personalNumber=" + personalNumber +
                ", userLoans=" + Arrays.toString(userLoans) +
                "sumOfLoans =" + calculateLoanAmount() +'}';
    }
}
