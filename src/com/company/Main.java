package com.company;

public class Main {

    public static void main(String[] args) {

        studentPersonal("Arun", "arun@bitech.lk", "0741547524");
        studentMarks(88,99,100);

        studentPersonal("Asky", "asky@bitech.lk", "07715465464");
        studentMarks(77,88,99);

        studentPersonal("Dhayan", "dhayan@bitech.lk", "07154545656");
        studentMarks(88,99,99);

    }

    public static void studentPersonal(String stname, String stemail, String stContact){

        String studentName = stname;
        String studentEmail = stemail;
        String studentContact = stContact;

        System.out.println("Student Name :"+studentName);
        System.out.println("Student Email :"+studentEmail);
        System.out.println("Student Contact :"+studentContact);

    }

    public static void studentMarks(int mk1, int mk2, int mk3){

        int marks1 = mk1;
        int marks2 = mk2;
        int marks3 = mk3;

        studentPerformanceReport(marks1,marks2,marks3);
    }

    public static void studentPerformanceReport(int mk1, int mk2, int mk3){
        int total = mk1 + mk2 + mk3;
        double avg = total / 3;

        System.out.println("Total :" + total);
        System.out.println("Average :" + avg + "\n");
    }




}
