package Java_SMT.InterviewPractice;

import java.util.HashMap;
import java.util.Map;

public class LongestUniqueSubstring {
    public static int lengthOfLongestSubstring1(String s){
        int left=0;
        int maxLen =0;
        Map<Character,Integer> hm= new HashMap<>();

        for (int right = 0; right < s.length(); right++) {
            char currentElem = s.charAt(right);
            if(hm.containsKey(currentElem))
                left = Math.max(left,hm.get(currentElem)+1);

            hm.put(currentElem,right);
            maxLen=Math.max(maxLen,right-left+1);
        }
        return maxLen;

    }
    public static void main(String[] args) {
        String str = "abcdabcbb";
        System.out.println("Longest substring length without repeating characters: " + lengthOfLongestSubstring1(str));
    }
}
