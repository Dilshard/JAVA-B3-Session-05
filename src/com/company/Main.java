package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("A");
    }

    public static void publisher(){
        author();
        System.out.println("B");
        bookTitle();
    }

    public static void bookTitle(){
        System.out.println("C");
    }

    public static void author(){
        System.out.println("D");
    }
}
