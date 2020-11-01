package com.avenger;

import java.util.Scanner;

public class Avenger {

        Scanner sc = new Scanner(System.in);

        public String name;
        public int age;
        public String weapon;

        public void getDetails(){

            System.out.println("Enter the name: ");
            name = sc.nextLine();

            System.out.println("Enter the age: ");
            age = sc.nextInt();

            sc.nextLine();
            System.out.println("Enter the weapon: ");
            weapon = sc.nextLine();

        }

        public void displayDetails(){

            System.out.println("The name is "+name+" and age "+age+", Weapon "+weapon);

        }
}


