package main;

import java.util.Arrays;

public class MissingInteger {
    public static void main(String[] args) {
        int[] test = {-1, -3};
        System.out.println(solution(test));
    }

    // given an array A of N integers, return the smallest positive integer (greater than 0) that does not occur in A.
    public static int solution(int[] A) {
        int smallInt = 1;
        Arrays.sort(A);
        for (int i = 0; i < A.length; i++) {
            if (A[i] == smallInt){
                smallInt++;
            }
        }
        return smallInt;
    }
}
