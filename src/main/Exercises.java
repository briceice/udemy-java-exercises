package main;

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
}
