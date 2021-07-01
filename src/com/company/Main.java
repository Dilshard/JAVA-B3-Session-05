package com.company;

public class Main {

    public static void main(String[] args) {

        total(57,88,99);
        total(45,65,78);

    }

    public static void total(int mk1, int mk2, int mk3){
        int total = mk1 + mk2 + mk3;
        System.out.println("Total :"+total);

        avg(total);
    }

    public static void avg(int asky){
        double avg = asky / 3;
        System.out.println("Average :"+avg);
    }
}
