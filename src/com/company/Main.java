package com.company;

public class Main {

    public static void main(String[] args) {

        Payment pay1 = new Payment();

        pay1.name = "Asky";
        pay1.sample();

        Book book1 = new Book();

        book1.bookTitle = "Learn JAVA";
        book1.noOfPages = 440;
        book1.authorName = "Arun";
        book1.publisher = "M.D Gunasena";
        book1.bookDetails();

        Book book2 = new Book();

        book2.bookTitle = "Zero to Hero in JAVA";
        book2.noOfPages = 500;
        book2.authorName = "Dhayan Vijayakumar";
        book2.publisher = "Sarasavi Book shop";
        book2.bookDetails();

        Book book3 = new Book();

        book3.bookTitle = "OOP in JAVA";
        book3.noOfPages = 685;
        book3.authorName = "Asky Mohamed";
        book3.publisher = "Auston Book shop";
        book3.bookDetails();



    }
}
