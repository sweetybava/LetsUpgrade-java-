package com.marks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

         int num;
         int num1;
         int num2;
         int num3;
         int num4;
         int total;

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter your Maths mark: ");
        num = sc.nextInt();

        System.out.println("Enter your Science mark: ");
        num1 = sc.nextInt();

        System.out.println("Enter your English mark: ");
        num2 = sc.nextInt();

        System.out.println("Enter your Social mark: ");
        num3 = sc.nextInt();

        System.out.println("Enter your Tamil mark: ");
        num4 = sc.nextInt();

        total = num+num1+num2+num3+num4;

        if(total>=450 && total<500) {
            System.out.println("Percentage: 90, Grade: A");
        }
        else if(total>=350 && total<449) {
            System.out.println("Percentage: 80, Grade: B");
        }
        else if(total>=250 && total<349) {
            System.out.println("Percentage: 70, Grade: C");
        }
        else if(total>=150 && total<249) {
            System.out.println("Percentage: 60, Grade: D");
        }
        else {
            System.out.println("You are failed for the Exam, Study More....");
        }
    }
}
