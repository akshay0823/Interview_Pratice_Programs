package Java_SMT.InterviewPractice;

public class photonRemoveStarsFromString {
    public static String removeStars(String s) {
        StringBuilder result = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '*') {
                // remove last added char
                result.deleteCharAt(result.length() - 1);
            } else {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s1 = "leet**cod*e";
        String s2 = "erase*****";

        System.out.println(removeStars(s1)); // Output: lecoe
        System.out.println(removeStars(s2)); // Output: (empty string)
    }
}
