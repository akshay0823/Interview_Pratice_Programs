package Java_SMT.InterviewPractice;

import java.util.ArrayList;

public class countVowelsAndConsonants {
    public static void countVowelsAndConsonants(String str) {
        int vowels = 0;
        int consonants = 0;
        String str1 = str.toLowerCase();
        for (char ch : str1.toCharArray()) {
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else
                    consonants++;
            }
        }
        System.out.println("Vowels : " + vowels + " Consonants : " + consonants);
    }

    public static void main(String[] args) {
        String str = "Hello World!";
        countVowelsAndConsonants(str);
    }
}
