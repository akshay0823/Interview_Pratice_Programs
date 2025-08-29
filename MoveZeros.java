package Java_SMT.InterviewPractice;
import java.util.*;

public class MoveZeros {
    public static void movesZerosFromArray(int [] arr){
        int index=0;
        for (int a: arr) {
            if(a!=0)
                arr[index++]=a;
        }
        while(index<arr.length){
            arr[index++]=0;
        }
        System.out.println("Moved Zeros: " + Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        movesZerosFromArray(arr);
    }
}
