package Java_SMT.InterviewPractice;

import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public static boolean checkAnagram(String str1,String str2){
        if(str1.length()!=str2.length()) return false;

        Map<Character,Integer> mp1 = new HashMap<>();
        Map<Character,Integer> mp2 = new HashMap<>();

        for (char c1: str1.toLowerCase().toCharArray()) {
            mp1.put(c1, mp1.getOrDefault(c1,0)+1);
        }
        for (char c2: str2.toLowerCase().toCharArray()) {
            mp2.put(c2, mp2.getOrDefault(c2,0)+1);
        }

        return mp1.equals(mp2);
    }
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        if(checkAnagram(str1,str2))
            System.out.println(str1 + " and " + str2 + " are anagrams ");
        else
            System.out.println(str1 + " and " + str2 + " are not anagrams ");
    }
}
