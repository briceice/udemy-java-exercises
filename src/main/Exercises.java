package main;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercises {
    public static void main(String[] args) {
        // Exercise 1
        System.out.println(toMilesPerHour(1.5));  //should return value 1
        System.out.println(toMilesPerHour(10.25)); //→ should return value 6
        System.out.println(toMilesPerHour(-5.6)); //→ should return value -1
        System.out.println(toMilesPerHour(25.42)); //→ should return value 16
        System.out.println(toMilesPerHour(75.114)); //→ should return value 47

        printConversion(1.5); //→ should print the following text (into the console - System.out): 1.5 km/h = 1 mi/h
        printConversion(10.25); //→ should print the following text (into the console - System.out): 10.25 km/h = 6 mi/h
        printConversion(-5.6); //→ should print the following text (into the console - System.out): Invalid Value
        printConversion(25.42); //→ should print the following text (into the console - System.out): 25.42 km/h = 16 mi/h
        printConversion(75.114); //→ should print the following text (into the console - System.out): 75.114 km/h = 47 mi/h

        // Exercise 2
        printMegaBytesAndKiloBytes(2500); //→ should print the following text: "2500 KB = 2 MB and 452 KB"
        printMegaBytesAndKiloBytes(-1024); //→ should print the following text: "Invalid Value" because parameter is less than 0.
        printMegaBytesAndKiloBytes(5000); //→ should print the following text: "5000 KB = 4 MB and 904 KB"

        // Exercise 3
        System.out.println(shouldWakeUp(true, 1)); //→ should return true
        System.out.println(shouldWakeUp(false, 2)); //→ should return false since the dog is not barking.
        System.out.println(shouldWakeUp(true, 8)); //→ should return false, since it's not before 8.
        System.out.println(shouldWakeUp(true, -1)); //→ should return false since the hourOfDay parameter needs to be in a range 0-23.

        // Exercise 4
        System.out.println(isLeapYear(-1600)); //→ should return false since the parameter is not in range (1-9999)
        System.out.println(isLeapYear(1600)); //→ should return true since 1600 is a leap year
        System.out.println(isLeapYear(2017)); //→ should return false since 2017 is not a leap year
        System.out.println(isLeapYear(2000));  //→ should return true because 2000 is a leap year

        // Exercise 5
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175)); //→ should return true since numbers are equal up to 3 decimal places.
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176)); //→ should return false since numbers are not equal up to 3 decimal places
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0)); //→ should return true since numbers are equal up to 3 decimal places.
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123)); //→ should return false since numbers are not equal up to 3 decimal places.

        // Exercise 6
        System.out.println(hasEqualSum(1, 1, 1));  //should return false since 1 + 1 is not equal to 1
        System.out.println(hasEqualSum(1, 1, 2));  //should return true since 1 + 1 is equal to 2
        System.out.println(hasEqualSum(1, -1, 0));  //should return true since 1 + (-1) is 1 - 1 and is equal to 0

        // Exercise 7
        System.out.println(hasTeen(9, 99, 19));  //should return true since 19 is in range 13 - 19
        System.out.println(hasTeen(23, 15, 42));  //should return true since 15 is in range 13 - 19
        System.out.println(hasTeen(22, 23, 34));  //should return false since numbers 22, 23, 34 are not in range 13-19

        System.out.println(isTeen(9));  //should return false since 9 is in not range 13 - 19
        System.out.println(isTeen(13));  //should return true since 13 is in range 13 - 19
    }

    // Exercise 1
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }
        return (long) (Math.round(kilometersPerHour / 1.609));
    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = (long) (Math.round(kilometersPerHour / 1.609));
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

    // Exercise 2
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            int megaBytes = kiloBytes / 1024;
            int remainder = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainder + " KB");
        }
    }

    // Exercise 3
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (hourOfDay < 0 || hourOfDay > 23){
            return false;
        }
        return barking && (hourOfDay < 8 || hourOfDay > 22);
    }

    // Exercise 4
    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999){
            return false;
        }
        if (year % 4 == 0) {
            if (year % 100 == 0){
                if (year % 400 == 0){
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    // Exercise 5
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        int int1 = (int) (num1 * 1000);
        int int2 = (int) (num2 * 1000);
        return int1 == int2;
    }

    // Exercise 6
    public static boolean hasEqualSum(int num1, int num2, int num3){
        return num1 + num2 == num3;
    }

    // Exercise 7
    public static boolean hasTeen(int num1, int num2, int num3){
        Integer[] teens = {13, 14, 15, 16, 17, 18, 19};
        for (Integer teen : teens) {
            if (teen == num1 || teen == num2 || teen == num3) {
                return true;
            }
        }
        return false;
    }

    public static boolean isTeen(int num1){
        Integer[] teens = {13, 14, 15, 16, 17, 18, 19};
        for (Integer teen : teens) {
            if (teen == num1) {
                return true;
            }
        }
        return false;
    }
}
