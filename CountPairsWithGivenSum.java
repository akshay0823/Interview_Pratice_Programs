package Java_SMT.InterviewPractice;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CountPairsWithGivenSum {
    public static int getPairsCount(int[] arr, int target){
        List<List<Integer>> pairs = new ArrayList<>();
        int n=arr.length;
        int count =0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    count++;
                   List<Integer> pair = new ArrayList<>();
                    pair.add(arr[i]);
                    pair.add(arr[j]);
                    pairs.add(pair);
                }
            }
        }
        System.out.println("Pairs with given sum: " + pairs);
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int targetSum = 6;
        System.out.println("Count of pairs with given sum: " + getPairsCount(arr, targetSum));
    }
}
