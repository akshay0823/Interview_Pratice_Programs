package Java_SMT.InterviewPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static int[] targetIndex(int[] nums,int target){
        Map<Integer,Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currentEle = nums[i];
            int  complement = target - currentEle;
            if(mp.containsKey(complement)){
                return new int[]{mp.get(complement),i};
            }
            mp.put(currentEle,i);
        }
        return new int[]{};
    }
    public static void main(String[] args) {
        int [] nums ={2,7,11,13};
        int target = 13;
       int[] result= targetIndex(nums,target);
        System.out.println(Arrays.toString(result));
    }
}
