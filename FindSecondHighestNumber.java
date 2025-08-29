package Java_SMT.InterviewPractice;

public class FindSecondHighestNumber {
    public static int findSecondHighestNumberInArray(int [] arr){
        if(arr.length<2 || arr==null){
            throw new IllegalArgumentException("Array should must be greater or equal to 2");
        }
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int num: arr) {
            if(num>first){
                second=first;
                first=num;
            } else if (num>second && num!=first) {
                second=num;
            }
        }

        return (second==Integer.MIN_VALUE)?-1:second;
    }
    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 20, 10};
        System.out.println(findSecondHighestNumberInArray(arr));
    }
}
