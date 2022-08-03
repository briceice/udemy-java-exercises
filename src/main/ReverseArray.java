package main;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        reverse(array);
    }

    private static void reverse(int[] intArray){
        String intArrayString = "[";
        for (int i = 0; i < intArray.length; i++) {
            intArrayString += intArray[i];
            if (i == intArray.length-1){
                break;
            }
            intArrayString += ", ";
        }
        intArrayString += "]";
        System.out.println("Array = " + intArrayString);

        int[] reverseArray = new int[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            reverseArray[i] = intArray[intArray.length - (1 + i)];
        }

        String reverseArrayString = "[";
        for (int i = 0; i < reverseArray.length; i++) {
            reverseArrayString += reverseArray[i];
            if (i == reverseArray.length-1){
                break;
            }
            reverseArrayString += ", ";
        }
        reverseArrayString += "]";
        System.out.println("Reversed array = " + reverseArrayString);
    }
}
