package Java_SMT.InterviewPractice;

import java.lang.reflect.Array;

public class ReverseTheWords {
    public static String reverseWords(String s){
        String[] words=s.trim().split(" ");
       StringBuilder sb = new StringBuilder();
       for(int i=words.length-1;i>=0;i--){
           sb.append(words[i]);
           if(i!=0) sb.append(" ");
       }
       return sb.toString();
    }
    public static void main(String[] args) {
        String str="the sky is blue";
        String result=reverseWords(str);
        System.out.println("Reversed words: " + result);
    }
}
