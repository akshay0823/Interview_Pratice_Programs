package Java_SMT.InterviewPractice;

import java.util.Arrays;

public class findSecondLargestSecondSmallest {
    public static void main(String[] args) {
        int [] arr={4,1,6,2,7,9,8,6};
        Arrays.sort(arr);
        System.out.println("Second Largest Element : "+arr[1] + " Second Smallest Element: "+arr[arr.length-2]);
    }
}
