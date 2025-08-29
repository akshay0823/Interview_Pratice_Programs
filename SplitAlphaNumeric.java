package Java_SMT.InterviewPractice;

public class SplitAlphaNumeric {
    public static void main(String[] args) {
        String input = "abc123def456";
        StringBuilder letters = new StringBuilder();
        StringBuilder numbers = new StringBuilder();
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                letters.append(ch);
            } else if (Character.isDigit(ch)) {
                numbers.append(ch);
            }
        }
        System.out.println("Letters: " + letters.toString() + ", Numbers: " + numbers.toString());
    }
}
