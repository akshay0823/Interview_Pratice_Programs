package Java_SMT.InterviewPractice;

import java.util.Arrays;

public class wissenInterview {

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] result = new int[array1.length / 2]; // 5 pairs

        int index = 0;
        for (int i = 0; i < array1.length - 1; i += 2) {
            result[index++] = array1[i] + array1[i + 1];
        }

        System.out.println(Arrays.toString(result)); // [3, 7, 11, 15, 19]
    }
}

