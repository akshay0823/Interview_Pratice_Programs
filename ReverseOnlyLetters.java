package Java_SMT.InterviewPractice;

public class ReverseOnlyLetters {
    public static String reverseOnlyLetters(String s) {
        char[] arr = s.toCharArray();
        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (!Character.isLetter(arr[i])) {
                i++;
            } else if (!Character.isLetter(arr[j])) {
                j--;
            } else {
                char temp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = temp;
            }
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println(reverseOnlyLetters("a1b2c3")); // Output: c1b2a3
    }
}
