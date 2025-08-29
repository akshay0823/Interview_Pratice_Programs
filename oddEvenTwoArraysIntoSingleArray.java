package Java_SMT.InterviewPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class oddEvenTwoArraysIntoSingleArray {
    public static void separateNumbers(int[] arr, ArrayList<Integer> even, ArrayList<Integer> odd) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 5, 7, 8, 10};
        int[] arr2 = {3, 4, 6, 9, 11};
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        separateNumbers(arr1, even, odd);
        separateNumbers(arr2, even, odd);

        int[] resultArray = new int[even.size() + odd.size()];
        int index = 0;
        for (int oddNum : odd)
            resultArray[index++] = oddNum;
        for (int evenNum : even)
            resultArray[index++] = evenNum;

        System.out.println(Arrays.toString(resultArray));
    }
}
