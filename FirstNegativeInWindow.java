package Java_SMT.InterviewPractice;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeInWindow {
    public static void firstNegative(int[] arr, int k) {
        Queue<Integer> q = new LinkedList<>();

        for (int i = 0; i < arr.length; i++) {

            // Add negative numbers
            if (arr[i] < 0) {
                q.add(arr[i]);
            }

            // Window formed
            if (i >= k - 1) {

                // Print answer
                if (q.isEmpty()) {
                    System.out.print("0 ");
                } else {
                    System.out.print(q.peek() + " ");
                }

                // Remove outgoing negative
                if (arr[i - k + 1] < 0) {
                    q.poll();
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        firstNegative(arr, k);
    }
}
