package Java_SMT.InterviewPractice;

import java.util.HashSet;

public class removeDuplicatenum {
    public int a =10;
    public static HashSet<Integer> removeDuplicateNumbers(int[] n){
        HashSet<Integer> hs = new HashSet<>();
        for(int nums:n){
            hs.add(nums);
        }
        return hs;
    }
    public static void main(String[] args) {
       int[] num ={2,3,47,9,0,9,5};
        System.out.println(removeDuplicateNumbers(num));
        removeDuplicatenum rn= new removeDuplicatenum();
        System.out.println(rn.a);
    }
}
