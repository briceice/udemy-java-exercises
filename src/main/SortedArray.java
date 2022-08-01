package main;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] newArray = getIntegers(5);
        int[] sortedArray = sortIntegers(newArray);
        printArray(sortedArray);
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integer values");
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int[] sortedArray = new int[array.length];
        Arrays.sort(array);

        for (int i = 0; i < sortedArray.length; i++) {
            sortedArray[i] = array[array.length - (i + 1)];
        }

        return sortedArray;
    }
}
