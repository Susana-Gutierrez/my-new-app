package com.susi;

import java.time.LocalDate;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // Write your code here
        System.out.println("Hello world!");

        int number = 100;
        String brand = "Amigos";
        Date date = new Date();

        byte theByte = -128;
        short theShort = 8989;
        int theInt = 78738334;
        long theLong = 787L;

        float pi = 3.14F;
        double doublePi = 3.1415;

        boolean isAdult = false;

        String name = new String("Susana");
        System.out.println(name.toUpperCase());

        char nameInitial = 'A';

        System.out.println(number);
        System.out.println(brand);
        System.out.println(date);
        System.out.println(theByte);
        System.out.println(theShort);
        System.out.println(theInt);
        System.out.println(theLong);
        System.out.println(pi);
        System.out.println(doublePi);
        System.out.println(isAdult);
        System.out.println(nameInitial);

        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getMonth());


    }

}
