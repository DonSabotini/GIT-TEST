package com.itacademy.java.oop.basics;

public class AccountApplication {

    public static void main(String[] args) {
        Account first = new Account("1","John",100);
        Account second = new Account("2","Jimmy",50);
        first.credit(20);
        System.out.println("New balance for the first account: " + first.credit(10));   // galbūt geriau "credit" kviest atskirai, o kai reikia atspausdint - "getBalance". Dėl skaitomumo
        System.out.println("New balance for the second account: " + second.credit(10));
        first.debit(500);
        second.transferTo(first,70);
        System.out.println("New balance for the first account: " + first.debit(30));
        first.transferTo(second,10);
        System.out.println("New balance for the first account: " + first.getBalance());
        System.out.println("New balance for the second account: " + second.getBalance());
        System.out.println(first);
        System.out.println(second);
    }
}
