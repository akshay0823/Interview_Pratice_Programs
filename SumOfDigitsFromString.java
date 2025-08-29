package Java_SMT.InterviewPractice;

public class SumOfDigitsFromString {
    public static void main(String[] args) {
        String str="1a2b3c4d4e";
        int sum=0;
        for(char ch:str.toCharArray()){
            if(Character.isDigit(ch)) {
                sum += ch-'0';
            }
        }
        System.out.println("Sum of digits in the string: " + sum);
    }
}
