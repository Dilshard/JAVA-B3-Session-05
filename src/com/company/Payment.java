package com.company;

public class Payment extends Book {
    String name;

    public void initialPayment(){
        System.out.println("This is initial payment method");
    }

    public void bookPayment(){
        System.out.println("This is book payment method!");
    }
}
