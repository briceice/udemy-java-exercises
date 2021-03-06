package main;

import java.util.Scanner;

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

        // Exercise 8
        System.out.println(area(5.0)); //should return 78.53975
        System.out.println(area(-1));  ///should return -1 since the parameter is negative
        System.out.println(area(5.0, 4.0)); //should return 20.0 (5 * 4 = 20)
        System.out.println(area(-1.0, 4.0));  //should return -1 since first the parameter is negative

        // Exercise 9
        printYearsAndDays(525600);  //→ should print "525600 min = 1 y and 0 d"
        printYearsAndDays(1051200); //→ should print "1051200 min = 2 y and 0 d"
        printYearsAndDays(561600);  //→ should print "561600 min = 1 y and 25 d"

        // Exercise 10
        printEqual(1, 1, 1); //should print text All numbers are equal
        printEqual(1, 1, 2); //should print text Neither all are equal or different
        printEqual(-1, -1, -1); //should print text Invalid Value
        printEqual(1, 2, 3); //should print text All numbers are different

        // Exercise 11
        System.out.println(isCatPlaying(true, 10)); //should return false since temperature is not in range 25 - 45
        System.out.println(isCatPlaying(false, 36)); //should return false since temperature is not in range 25 - 35 (summer parameter is false)
        System.out.println(isCatPlaying(false, 35)); //should return true since temperature is in range 25 - 35

        // Exercise 13
        System.out.println(getDaysInMonth(1, 2020)); //→ should return 31 since January has 31 days.
        System.out.println(getDaysInMonth(2, 2020)); //→ should return 29 since February has 29 days in a leap year and 2020 is a leap year.
        System.out.println(getDaysInMonth(2, 2018)); //→ should return 28 since February has 28 days if it's not a leap year and 2018 is not a leap year.
        System.out.println(getDaysInMonth(-1, 2020)); //→ should return -1 since the parameter month is invalid.
        System.out.println(getDaysInMonth(1, -2020)); //→ should return -1 since the parameter year is outside the range of 1 to 9999.

        // Exercise 14
        System.out.println(sumOdd(1, 100)); //→ should return 2500
        System.out.println(sumOdd(-1, 100)); //→  should return -1
        System.out.println(sumOdd(100, 100)); //→ should return 0
        System.out.println(sumOdd(13, 13)); //→ should return 13 (This set contains one number, 13, and it is odd)
        System.out.println(sumOdd(100, -100)); //→ should return -1
        System.out.println(sumOdd(100, 1000)); //→ should return 247500

        // Exercise 15
        System.out.println(isPalindrome(-1221)); //→ should return true
        System.out.println(isPalindrome(707)); //→ should return true
        System.out.println(isPalindrome(11212)); //→ should return false because reverse is 21211 and that is not equal to 11212.

        // Exercise 16
        System.out.println(sumFirstAndLastDigit(252)); //→ should return 4, the first digit is 2 and the last is 2 which gives us 2+2 and the sum is 4.
        System.out.println(sumFirstAndLastDigit(257)); //→ should return 9, the first digit is 2 and the last is 7 which gives us 2+7 and the sum is 9.
        System.out.println(sumFirstAndLastDigit(0)); //→ should return 0, the first digit and the last digit is 0 since we only have 1 digit, which gives us 0+0 and the sum is 0.
        System.out.println(sumFirstAndLastDigit(5)); //→ should return 10, the first digit and the last digit is 5 since we only have 1 digit, which gives us 5+5 and the sum is 10.
        System.out.println(sumFirstAndLastDigit(-10)); //→ should return -1, since the parameter is negative and needs to be positive.

        // Exercise 17
        System.out.println(getEvenDigitSum(123456789)); //→ should return 20 since 2 + 4 + 6 + 8 = 20
        System.out.println(getEvenDigitSum(252)); //→ should return 4 since 2 + 2 = 4
        System.out.println(getEvenDigitSum(-22)); //→ should return -1 since the number is negative

        // Exercise 18
        System.out.println(hasSharedDigit(12, 23)); //→ should return true since the digit 2 appears in both numbers
        System.out.println(hasSharedDigit(9, 99)); //→ should return false since 9 is not within the range of 10-99
        System.out.println(hasSharedDigit(15, 55)); //→ should return true since the digit 5 appears in both numbers

        // Exercise 19
        System.out.println(hasSameLastDigit(41, 22, 71)); //→ should return true since 1 is the rightmost digit in numbers 41 and 71
        System.out.println(hasSameLastDigit(23, 32, 42)); //→ should return true since 2 is the rightmost digit in numbers 32 and 42
        System.out.println(hasSameLastDigit(9, 99, 999)); //→ should return false since 9 is not within the range of 10-1000

        System.out.println(isValid(10)); //→ should return true since 10 is within the range of 10-1000
        System.out.println(isValid(468)); //→ should return true since 468 is within the range of 10-1000
        System.out.println(isValid(1051)); //→ should return false since 1051 is not within the range of 10-1000

        // Exercise 20
        System.out.println(getGreatestCommonDivisor(25, 15)); //should return 5 since both can be divided by 5 without a remainder
        System.out.println(getGreatestCommonDivisor(12, 30)); //should return 6 since both can be divided by 6 without a remainder
        System.out.println(getGreatestCommonDivisor(9, 18)); //should return -1 since the first parameter is < 10
        System.out.println(getGreatestCommonDivisor(81, 153)); //should return 9 since both can be divided by 9 without a remainder

        // Exercise 21
        printFactors(6); //→ should print 1 2 3 6
        printFactors(32); //→ should print 1 2 4 8 16 32
        printFactors(10); //→ should print 1 2 5 10
        printFactors(-1); //→ should print "Invalid Value" since number is < 1

        // Exercise 22
        System.out.println(isPerfectNumber(6)); //should return true since its proper divisors are 1, 2, 3 and the sum is 1 + 2 + 3 = 6
        System.out.println(isPerfectNumber(28)); //should return true since its proper divisors are 1, 2, 4, 7, 14 and the sum is 1 + 2 + 4 + 7 + 14 = 28
        System.out.println(isPerfectNumber(5)); //should return false since its only proper divisor is 1 and the sum is 1 not 5
        System.out.println(isPerfectNumber(-1)); //should return false since the number is < 1

        // Exercise 23
        System.out.println(getDigitCount(0)); //should return 1 since there is only 1 digit
        System.out.println(getDigitCount(123)); //should return 3
        System.out.println(getDigitCount(-12)); //should return -1 since the parameter is negative
        System.out.println(getDigitCount(5200)); //should return 4 since there are 4 digits in the number

        System.out.println(reverse(-121)); //should  return -121
        System.out.println(reverse(1212)); //should return  2121
        System.out.println(reverse(1234)); //should return 4321
        System.out.println(reverse(100)); //should return 1

        numberToWords(123); //should print "One Two Three".
        numberToWords(1010); //should print "One Zero One Zero".
        numberToWords(1000); //should print "One Zero Zero Zero".
        numberToWords(-12); //should print "Invalid Value" since the parameter is negative.

        // Exercise 24
        System.out.println(canPack(1, 0, 4)); //should return false since bigCount is 1 (big bag of 5 kilos) and goal is 4 kilos.
        System.out.println(canPack(1, 0, 5)); //should return true since bigCount is 1 (big bag of 5 kilos) and goal is 5 kilos.
        System.out.println(canPack(0, 5, 4)); //should return true since smallCount is 5 (small bags of 1 kilo) and goal is 4 kilos, and we have 1 bag left which is ok as mentioned above.
        System.out.println(canPack(2, 2, 11)); //should return true since bigCount is 2 (big bags 5 kilos each) and smallCount is 2 (small bags of 1 kilo), makes in total 12 kilos and goal is 11 kilos.
        System.out.println(canPack(-3, 2, 12)); //should return false since bigCount is negative.

        // Exercise 25
        System.out.println(getLargestPrime(21)); //should return 7 since 7 is the largest prime (3 * 7 = 21)
        System.out.println(getLargestPrime(217)); //should return 31 since 31 is the largest prime (7 * 31 = 217)
        System.out.println(getLargestPrime(0)); //should return -1 since 0 does not have any prime numbers
        System.out.println(getLargestPrime(45)); //should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
        System.out.println(getLargestPrime(-1)); //should return -1 since the parameter is negative
        System.out.println(getLargestPrime(16)); //should return 2 since 2 is the largest prime (2 * 8 = 16)

        // Exercise 26
        printSquareStar(5);
        printSquareStar(8);
        printSquareStar(2);

        // Exercise 27
        //inputThenPrintSumAndAverage();

        // Exercise 28
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2)); //→ should return -1 since the width parameter is invalid
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2)); //→ should return 3 since the wall area is 7.14, a single bucket can cover an area of 1.5 and Bob has 2 extra buckets home.
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1)); //→ should return 3 since the wall area is 8.9375, a single bucket can cover an area of 2.5 and Bob has 1 extra bucket at home.

        System.out.println(getBucketCount(-3.4, 2.1, 1.5)); //→ should return -1 since the width parameter is invalid
        System.out.println(getBucketCount(3.4, 2.1, 1.5)); //→ should return 5 since the wall area is 7.14, and a single bucket can cover an area of 1.5.
        System.out.println(getBucketCount(7.25, 4.3, 2.35)); //→ should return 14 since the wall area is 31.175, and a single bucket can cover an area of 2.35.

        System.out.println(getBucketCount(3.4, 1.5)); //→ should return 3 since the area is 3.4 and a single bucket can cover an area of 1.5
        System.out.println(getBucketCount(6.26, 2.2)); //→ should return 3 since the wall area is 6.26 and a single bucket can cover an area of 2.2.
        System.out.println(getBucketCount(3.26, 0.75)); //→ should return 5 since the wall area is 3.26, and a single bucket can cover an area of 0.75 .

    }

    // Exercise 1
    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0){
            return -1;
        }
        return (Math.round(kilometersPerHour / 1.609));
    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = (Math.round(kilometersPerHour / 1.609));
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
                return year % 400 == 0;
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

    // Exercise 8
    public static double area(double radius){
        if (radius < 0){
            return -1.0;
        }
        return Math.PI * Math.pow(radius, 2);
    }

    public static double area(double x, double y){
        if (x < 0 || y < 0){
            return -1.0;
        }
        return x * y;
    }

    // Exercise 9
    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
            return;
        }
        int years = (int) (minutes / 525600);
        int days = (int) ((minutes % 525600) / 1440);
        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }

    // Exercise 10
    public static void printEqual(int x, int y, int z){
        if (x < 0 || y < 0 || z < 0){
            System.out.println("Invalid Value");
            return;
        }
        if (x == y && x == z){
            System.out.println("All numbers are equal");
            return;
        }
        if (x != y && x != z && y != z){
            System.out.println("All numbers are different");
            return;
        }
        System.out.println("Neither all are equal or different");
    }

    // Exercise 11
    public static boolean isCatPlaying(boolean summer, int temperature){
        if (summer){
            return temperature >= 25 && temperature <= 45;
        } else {
            return temperature >= 25 && temperature <= 35;
        }
    }

    // Exercise 12
    public static void printNumberInWord(int number){
        switch (number){
            case 0:
                System.out.println("ZERO");
                break;

            case 1:
                System.out.println("ONE");
                break;

            case 2:
                System.out.println("TWO");
                break;

            case 3:
                System.out.println("THREE");
                break;

            case 4:
                System.out.println("FOUR");
                break;

            case 5:
                System.out.println("FIVE");
                break;

            case 6:
                System.out.println("SIX");
                break;

            case 7:
                System.out.println("SEVEN");
                break;

            case 8:
                System.out.println("EIGHT");
                break;

            case 9:
                System.out.println("NINE");
                break;

            default:
                System.out.println("OTHER");
        }
    }

    // Exercise 13
    public static int getDaysInMonth(int month, int year){
        if (month < 1 || month > 12){
            return -1;
        }
        if (year < 1 || year > 9999){
            return -1;
        }
        switch (month){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;

            case 4: case 6: case 9: case 11:
                return 30;

            case 2:
                if (isLeapYear(year)){
                    return 29;
                } else {
                    return 28;
                }

            default:
                return -1;
        }
    }

    // Exercise 14
    public static boolean isOdd(int number){
        if (number <= 0){
            return false;
        }
        return (number % 2 != 0);
    }

    public static int sumOdd(int start, int end){
        int sum = 0;
        if (start > end || start < 0){
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }

    // Exercise 15
    public static boolean isPalindrome(int number){
        String num = String.valueOf(Math.abs(number));
        StringBuilder numReverse = new StringBuilder();
        for (int i = (num.length() - 1); i >= 0; i--) {
            numReverse.append(num.charAt(i));
        }
        return num.equals(numReverse.toString());
    }

    // Exercise 16
    public static int sumFirstAndLastDigit(int number){
        int firstDigit = number;
        int lastDigit = number % 10;

        if (number < 0){
            return -1;
        }

        while (number > 0){
            firstDigit = number % 10;
            number /= 10;
        }

        return firstDigit + lastDigit;
    }

    // Exercise 17
    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }

        int digit;
        int sum = 0;

        while (number > 0){
            digit = number % 10;
            if (digit % 2 == 0){
                sum += digit;
            }
            number /= 10;
        }

        return sum;
    }

    // Exercise 18
    public static boolean hasSharedDigit(int num1, int num2){
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99){
            return false;
        }

        int digit1;
        int digit2;
        int numSave = num2;

        while (num1 > 0){
            digit1 = num1 % 10;
            while (num2 > 0){
                digit2 = num2 % 10;
                if (digit1 == digit2){
                    return true;
                }
                num2 /= 10;
            }
            num1 /= 10;
            num2 = numSave;
        }

        return false;
    }

    // Exercise 19
    public static boolean hasSameLastDigit(int x, int y, int z){
        if (!isValid(x) || !isValid(y) || !isValid(z)){
            return false;
        }
        int xDigit = x % 10;
        int yDigit = y % 10;
        int zDigit = z % 10;

        return xDigit == yDigit || xDigit == zDigit || yDigit == zDigit;
    }

    public static boolean isValid(int number){
        return number >= 10 && number <= 1000;
    }

    // Exercise 20
    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10){
            return -1;
        }

        if (first > second){
            for (int i = second; i > 0; i--) {
                if (first % i == 0 && second % i == 0){
                    return i;
                }
            }
        } else {
            for (int i = first; i > 0; i--) {
                if (first % i == 0 && second % i == 0){
                    return i;
                }
            }
        }

        return -1;
    }

    // Exercise 21
    public static void printFactors(int number){
        if (number < 1){
            System.out.println("Invalid Value");
        }

        for (int i = 1; i <= number; i++) {
            if (number % i == 0){
                System.out.println(i);
            }
        }
    }

    // Exercise 22
    public static boolean isPerfectNumber(int number){
        if (number < 1){
            return false;
        }

        int sum = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0){
                sum += i;
            }
        }

        return number == sum;
    }

    // Exercise 23
    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
        }

        int digit;
        int numReverse = reverse(number);
        int digitCount = getDigitCount(number);

        while (digitCount > 0){
            digit = numReverse % 10;
            printNumberInWord(digit);
            numReverse /= 10;
            digitCount --;
        }

    }

    public static int reverse(int number){
        String num = String.valueOf(Math.abs(number));
        StringBuilder stringReverse = new StringBuilder();
        boolean isNegative = number < 0;
        for (int i = (num.length() - 1); i >= 0; i--) {
            stringReverse.append(num.charAt(i));
        }
        if (isNegative){
            return -Integer.parseInt(stringReverse.toString());
        } else {
            return Integer.parseInt(stringReverse.toString());
        }
    }

    public static int getDigitCount(int number){
        if (number < 0){
            return -1;
        }

        int count = 0;

        if (number == 0){
            count = 1;
        }

        while (number > 0){
            count ++;
            number /= 10;
        }

        return count;
    }

    // Exercise 24
    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        if (goal / 5 <= bigCount){
            return smallCount >= goal % 5;
        } else if(goal - 5*bigCount <= smallCount){
            return true;
        } else {
            return smallCount >= goal;
        }
    }

    // Exercise 25
    public static int getLargestPrime(int number){
        if (number < 0){
            return -1;
        }
        for (int i = number; i > 0; i--) {
            if (number % i == 0){
                if (isPrime(i)){
                    return i;
                }
            }
        }
        return -1;
    }

    static boolean isPrime(int n)
    {
        // Corner case
        if (n <= 1)
            return false;

        // Check from 2 to n-1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;

        return true;
    }

    // Exercise 26
    public static void printSquareStar(int number){
        if (number < 5){
            System.out.println("Invalid Value");
        } else {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number ; j++) {
                    if (i==1 || i==number || j==1 || j==number || j==i || j==number-i+1){
                        System.out.print("*");
                    }
                    else System.out.print(" ");
                }
                System.out.println();
            }
        }
    }

    // Exercise 27
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        long average;

        System.out.println("Enter a number: ");
        while (scanner.hasNextInt()){
            sum += scanner.nextInt();
            count ++;
        }

        if (count == 0){
            System.out.println("SUM = 0 AVG = 0");
        } else {
            average = Math.round((double) sum / count);
            System.out.println("SUM = " + sum + " AVG = " + average);
        }

        scanner.close();

    }

    // Exercise 28
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }

        double area = width * height;
        int buckets = (int) Math.ceil(area / areaPerBucket);

        return buckets - extraBuckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        if (width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }

        double area = width * height;

        return (int) Math.ceil(area / areaPerBucket);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if (area <= 0 || areaPerBucket <= 0){
            return -1;
        }

        return (int) Math.ceil(area / areaPerBucket);
    }
}
