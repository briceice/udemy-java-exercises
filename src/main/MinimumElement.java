package main;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int myInt = readInteger();
        int[] myArray = readElements(myInt);
        System.out.println(findMin(myArray));
    }

    private static int readInteger(){
        System.out.println("Enter int");
        return scanner.nextInt();
    }

    private static int[] readElements(int number){
        System.out.println("Enter " + number + " integer values");
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] intArray){
        Arrays.sort(intArray);
        return intArray[0];
    }
}
