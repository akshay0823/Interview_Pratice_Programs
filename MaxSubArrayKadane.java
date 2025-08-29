package Java_SMT.InterviewPractice;

public class MaxSubArrayKadane {
    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0]; // Global max
        int currSum = nums[0]; // Local sum

        for (int i = 1; i < nums.length; i++) {
            // Decide whether to start fresh from current number OR add to current sum
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(arr);
        System.out.println("Maximum Subarray Sum: " + result);
    }
}

