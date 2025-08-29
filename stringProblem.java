package Java_SMT.InterviewPractice;

public class stringProblem {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "bcdaf";
        String str3 = "";
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (str2.indexOf(ch) != -1) {
                str3 = str3 + ch;
            }
        }
        System.out.println("The common string is " + str3);
    }
}

