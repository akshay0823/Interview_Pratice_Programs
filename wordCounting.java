package Java_SMT.InterviewPractice;
import java.util.*;
public class wordCounting {
    public static String FindFirstWordWithDuplicateLetters(String str){
        String[] words= str.split(" ");
        for(String word: words){
            HashMap<Character,Integer> hm= new HashMap<>();
            for(char ch:word.toCharArray()){
                hm.put(ch,hm.getOrDefault(ch,0)+1);
            }
            for(Map.Entry<Character,Integer> es:hm.entrySet()){
                if(es.getValue()>1){
                  return word;
                }
            }
        }
        return "-1";
    }
    public static void main(String[] args) {
//        String str = "Hello World! This is a test string.";
        String str = "Hey Apple";
        System.out.println(FindFirstWordWithDuplicateLetters(str));
    }
}
