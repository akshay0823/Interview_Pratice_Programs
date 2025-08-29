package Java_SMT.InterviewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseTheArray {
    public static void main(String[] args) {
//        int arr[]={1,2,3,4,5,6};
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 4, 5, 6, 7, 9, 10));
        int m=3;
//        int left = m+1,right=arr.length-1;
//        while (left<right){
//            int temp = arr[left];
//            arr[left]=arr[right];
//            arr[right]=temp;
//            left++;
//            right--;
//        }
        Collections.reverse(arr.subList(m+1,arr.size()));
        System.out.println(arr);
//        for (int a:
//             arr) {
//            System.out.println(a);
//        }

    }
}
