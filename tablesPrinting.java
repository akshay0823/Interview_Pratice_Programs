package Java_SMT.InterviewPractice;

import java.util.Scanner;

public class tablesPrinting {
    public static void main(String[] args) {
        System.out.println("Enter the number to print a table of it : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(num+" X "+ i +" = " + num*i);
        }

    }
}
