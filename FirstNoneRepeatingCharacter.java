package Java_SMT.InterviewPractice;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.TreeMap;

public class FirstNoneRepeatingCharacter {
    public static void main(String[] args) {
        String str= "chatGpt";
        LinkedHashMap<Character,Integer> map= new LinkedHashMap<>();

        for (char c:str.toCharArray()) {
                map.put(c,map.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character,Integer> ch:map.entrySet()) {
                 if(ch.getValue()==1){
                     System.out.println(ch.getKey());
                     break;
                 }
        }
    }
}
