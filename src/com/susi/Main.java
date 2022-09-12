package com.susi;

import java.time.LocalDate;
import java.time.LocalDateTime;
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

        int a = 10;
        int b = a;
        a = 100;
        System.out.println("a = " + a + " - b = " + b);

        Person alex = new Person ("alex");
        Person mariam = alex;

        System.out.println("before changing alex");
        System.out.println(alex.name + " " + mariam.name);

        mariam.name = "Mariam";


        System.out.println("after changing alex");
        System.out.println(alex.name + " " +  mariam.name);

        int zero = 0;
        int one = 1;
        int subscriberCount = 1_000_000;

        System.out.println(name);
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(0));
        String ana = "ana";
        System.out.println(name.contains(ana));
        System.out.println(name.equals(ana));

        Date newDate = new Date();
        LocalDate newLocalDate = LocalDate.now();
        LocalDateTime newLocalDateTime = LocalDateTime.now();

        System.out.println(newDate);
        System.out.println(newLocalDate);
        System.out.println(newLocalDateTime);

        int ten = 10;
        int two = 2;
        int addition = ten + two;

        System.out.println(addition);
        System.out.println(10 + 2 + 90);
        System.out.println(10 - 2);
        System.out.println(10 * 2 + 7);
        System.out.println(10 % 3);

    }

    static class Person {
        String name;

        Person (String name) {
            this.name = name;
        }
    }

}
