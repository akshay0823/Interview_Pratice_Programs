package Java_SMT.InterviewPractice;

import java.util.*;

public class FindDuplicateNumbers {
    public static void main(String[] args) {
        int [] nums={1,2,4,6,7,23,3,5,2,3,4,5};
        Map<Integer,Integer> hm = new HashMap<>();
        for (int no: nums) {
//            Integer count = hm.get(no);
//            if (count==null)
//                hm.put(no,1);
//            else{
//                count+=1;
//                hm.put(no,count);
//            }
            hm.put(no,hm.getOrDefault(no,0)+1);
        }
//        Set<Map.Entry<Integer,Integer>> ms = hm.entrySet();
        for (Map.Entry<Integer,Integer> es: hm.entrySet()){
            if(es.getValue()>1)
                System.out.print(es.getKey()+",");
        }

    }
}
