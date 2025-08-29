package Java_SMT.InterviewPractice;

public class FindMissingNumber {
    public static int findnumber(int[] arr) {
        int n = arr.length + 1;
        int expectedNum = n * (n + 1) / 2;
        int sum = 0;
        for (int a : arr)
            sum += a;
        return expectedNum - sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4};
        System.out.println(findnumber(nums));

    }
}
