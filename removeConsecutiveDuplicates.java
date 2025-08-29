package Java_SMT.InterviewPractice;

import java.util.HashSet;
import java.util.Set;

public class removeConsecutiveDuplicates {
    public static void main(String[] args) {
        String str = "aabcddeb";
        char prevChar = str.charAt(0);
        StringBuilder sb = new StringBuilder();
        sb.append(prevChar);
        for (int i = 1; i <str.length() ; i++) {
            char currentChar = str.charAt(i);
            if(currentChar!=prevChar){
                sb.append(currentChar);
                prevChar=currentChar;
            }
        }
        System.out.println("String after removing consecutive duplicates: " + sb.toString());
    }
}

