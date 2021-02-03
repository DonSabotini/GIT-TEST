package com.itacademy.java.opp;

public class Loan {

    private int id;
    private double amount;
    private Type type;
    private String terminationDate;

    public Loan(int id, double amount, Type type, String terminationDate) {
        this.id = id;
        this.amount = amount;
        this.type = type;
        this.terminationDate = terminationDate;
    }

    public Loan() {
        this.id = 0;
        this.amount = 1200;
        this.type = Type.CONSUMER;
        this.terminationDate = "2021-10-01";
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", amount=" + amount +
                ", type=" + type +
                ", terminationDate='" + terminationDate + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public Type getType() {
        return type;
    }

    public String getTerminationDate() {
        return terminationDate;
    }
}
