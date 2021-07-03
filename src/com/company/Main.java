package com.company;

public class Main {

    public static void main(String[] args) {

        Payment pay = new Payment();

        pay.bookPayment();
        pay.initialPayment();
        pay.bookCustomerDetails();
        pay.bookDetails();
        pay.noOfPages = 500;
        pay.deliveryAmount();


    }
}
