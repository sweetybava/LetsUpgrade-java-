package com.avenger;

public class Main {

    public static void main(String[] args) {


        Avenger[] avengerss=new Avenger[3];

        for(int i=0; i<3; i++){

            avengerss[i] = new Avenger();

        }

//        getdetails

        for(int i=0; i<3; i++){

            avengerss[i].getDetails();

        }

//        displaydetails

        for(int i=0; i<3; i++){

            avengerss[i].displayDetails();

        }

    }
}
