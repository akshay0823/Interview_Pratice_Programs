package Java_SMT.InterviewPractice;

import java.util.Arrays;

public class LeftRotateArraywithKvalue {
    public static void leftrotate(int [] nums, int k){
        int left=0,right = nums.length-1;
        //reverse the array from the K position
        reverseArray(left,k-1,nums);

        //reverse the rest of the elements from the array
        reverseArray(k,right,nums);

        //reverse the whole array
        reverseArray(left,right,nums);

    }
    public static void reverseArray(int start,int end,int[] arr){
        int temp;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
            int[] nums= {1,2,3,4,5};
            int k=2;
            leftrotate(nums,k);
        System.out.println(Arrays.toString(nums));
    }
}
