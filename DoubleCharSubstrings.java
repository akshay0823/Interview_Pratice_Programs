package Java_SMT.InterviewPractice;
import java.util.ArrayList;
public class DoubleCharSubstrings {
    public static ArrayList<String> findDoubleCharSubstrings(String input) {
        ArrayList<String> result = new ArrayList<>();
        int i = 0;
        while (i < input.length() - 1) {
            StringBuilder temp = new StringBuilder();
            if (input.charAt(i) == input.charAt(i + 1)) {
                temp.append(input.charAt(i));
                int j = i + 1;
                while (j < input.length() && input.charAt(j) == input.charAt(i)) {
                    temp.append(input.charAt(j));
                    j++;
                }
                result.add(temp.toString());
                i = j; // jump past the repeating chars
            } else {
                i++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String input = "aabbbcdddee";
        ArrayList<String> substrings = findDoubleCharSubstrings(input);
        System.out.println("Double char substrings: " + substrings);
    }
}
