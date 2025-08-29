package Java_SMT.InterviewPractice;

public class DigitalRoot {
    public static int findDigitalRoot(int num){
        while(num>=10){
            int sum=0;
            while(num>0){
                sum+=num%10;
                num=num/10;
            }
            num=sum;
        }
        return num;
    }
    public static void main(String[] args) {
        int num=12345;
        int digitalRoot = findDigitalRoot(num);
        System.out.println("The digital root of " + num + " is: " + digitalRoot);
    }
}
