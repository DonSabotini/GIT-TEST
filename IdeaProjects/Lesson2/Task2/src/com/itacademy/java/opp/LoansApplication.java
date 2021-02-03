package com.itacademy.java.opp;

public class LoansApplication {

    public static void main(String[] args) {

        Loan small = new Loan();
        Loan big = new Loan(1,15000.00d, Type.LEASING, "2022-01-01");
        Customer john = new Customer("John", "Lennon", 48 ,86919191, new Loan[]{small, big});
        System.out.print(john);


    }





}

