package Java_SMT.InterviewPractice;

import java.util.HashSet;

public class wissen {
    public static void main(String[] args) {
        System.out.println("Tryprogramiz.pro");
        String str1 = "abcdghj";
        String str2 = "afghbd";
        HashSet<Character> set1 = new HashSet<Character>();
        HashSet<Character> common = new HashSet<Character>();
        for (char ch : str1.toCharArray()) {
            set1.add(ch);
        }
        for (char ch1 : str2.toCharArray()) {
            if (set1.contains(ch1)) {
                common.add(ch1);
            }
        }
        System.out.println("Duplicate characters :" + common);
        System.out.println(common.toString());
    }
}


