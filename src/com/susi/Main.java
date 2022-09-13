package com.susi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
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

        // Math

        System.out.println(Math.abs(-10));
        System.out.println(Math.max(6, 10.5));
        System.out.println(Math.min(6, 10.5));
        System.out.println((int) Math.pow(5, 2));
        System.out.println((int) Math.sqrt(25));
        System.out.println(Math.PI);

        // Comparison Operators

        int khalidAge = 18;
        int mariamAge = 20;
        boolean isKhalidOlderThanMariam = khalidAge > mariamAge;
        System.out.println(isKhalidOlderThanMariam);
        System.out.println(mariamAge < khalidAge);
        System.out.println(khalidAge == mariamAge);
        System.out.println(khalidAge != mariamAge);

        boolean isNewAdult = false;
        boolean isStudent = true;
        boolean isSusisFriend = true;
        System.out.println(isNewAdult && isStudent);
        System.out.println(isNewAdult || isStudent);
        System.out.println((isNewAdult || isStudent) && isSusisFriend);

        // If statements

        int age = 17;

        if (age >= 18) {
            System.out.println("I'm an adult");
        } else if (age >= 16 && age < 18) {
            System.out.println("I'm almost an adult");
        } else {
            System.out.println("I'm not an adult");
        }

        String message = age >= 18 ? "Hooray... I am an adult" : "I am not an adult";
        System.out.println(message);

        // Switch Statement

        String gender = "FEMALE";
        if (gender.equals("FEMALE")) {
            System.out.println("FEMALE");
        } else if (gender.equals("MALE")) {
            System.out.println("MALE");
        } else if (gender.equals("PREFER_NOT_SAY")) {
            System.out.println("PREFER NOT TO SAY");
        } else {
            System.out.println("NO VALUE");
        }

        switch (gender) {
            case "FEMALE":
                System.out.println("FEMALE");
                break;
            case "MALE":
                System.out.println("MALE");
                break;
            case "PREFER_NOT_SAY":
                System.out.println("PREFER NOT TO SAY");
                break;
            default:
                System.out.println("NO VALUE");
        }

        //Arrays

        int newZero = 0;
        int newOne = 1;

        int [] numbers = new int[3];
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 2;
        System.out.println(Arrays.toString(numbers));

        int [] newNumbers = {3, 4, 5};
        System.out.println(Arrays.toString(newNumbers));
        System.out.println(newNumbers.length);

        String [] arrayNames = {"Ali", "Maria"};
        System.out.println(Arrays.toString(arrayNames));
        System.out.println(arrayNames.length);

    }

    static class Person {
        String name;

        Person (String name) {
            this.name = name;
        }
    }

}
