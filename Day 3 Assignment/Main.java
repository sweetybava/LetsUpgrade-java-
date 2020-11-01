package com.employee1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name;
        String dob;
        int birthyear;
        int salary;
        int age;
        int annual;
        int year = 2020;


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        name = sc.nextLine();

        System.out.println("Enter your DOB: ");
        dob = sc.nextLine();

        System.out.println("Enter your birth year: ");
        birthyear = sc.nextInt();

        System.out.println("Enter your monthly salary: ");
        salary = sc.nextInt();

        age = year-birthyear;

        annual = salary*12;

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Annual income: "+annual);


        if(annual>=1000000 && annual<1500000){
             System.out.println("Tax amount: 1,33,500");
        }
        else if(annual>=500000 && annual<1000000){
            System.out.println("Tax amount: 1,00,000");
        }
        else if(annual>=300000 && annual<500000){
            System.out.println("Tax amount: 93,500");
        }
        else {
            System.out.println("Tax amount: Under 300,000, No tax to pay ");
        }



    }
}
