package com.company;

public class Book extends Delivery{

    String bookTitle;
    int noOfPages;
    String authorName;
    String publisher;

    public void bookDetails(){
        System.out.println("Welcome to Book fare");
        System.out.println("***********************");
        System.out.println("Book Title : "+bookTitle);
        System.out.println("No Of Pages : "+noOfPages);
        System.out.println("Author Name : "+authorName);
        System.out.println("Publisher: "+publisher);
        System.out.println();
    }

    public void bookCustomerDetails(){
        System.out.println("This is Book customer Details method!");

    }

}
