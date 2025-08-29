package Java_SMT.InterviewPractice;

import java.util.Stack;

public class Parenthesis {
    public static boolean isBalanced(String str) {
        if (str == null || str.isEmpty()) return true;

        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if (!isMatchingPair(top, ch)) return false;
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char top, char ch) {
        return (top == '(' && ch == ')') ||
                (top == '{' && ch == '}') ||
                (top == '[' && ch == ']');
    }

    public static void main(String[] args) {
//        String str = "[(){}]";
        String str = "([)]";
        System.out.println("Is the string balanced? " + isBalanced(str));

    }
}
