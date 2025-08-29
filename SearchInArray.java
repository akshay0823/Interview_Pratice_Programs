package Java_SMT.InterviewPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchInArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 4, 5, 6, 7, 9, 10));
        ArrayList<Integer> queries = new ArrayList<>(Arrays.asList(3,5));
        ArrayList<Integer> result = new ArrayList<>();
        int arrSize = arr.size();
        int queriesSize = queries.size();
        for (int i = 0; i <queriesSize; i++) {
            int sum=0;
            for (int j = 0; j <arrSize ; j++) {
                  if(arr.get(j)<=queries.get(i))
                      sum+=arr.get(j);
            }
            result.add(sum);
        }
        System.out.println(result);
    }
}
