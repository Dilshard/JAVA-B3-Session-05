package com.company;

public class Main {

    public static void main(String[] args) {

        int newTotal = total(45,45) + 100 / 2 * 10;
        System.out.println(newTotal);
    }

    public static int total(int mk1, int mk2){
        int total = mk1 + mk2;
        return total;
    }

    public static void total2(int mk1, int mk2){
        int total = mk1 + mk2;
        System.out.println(total);
    }

}
