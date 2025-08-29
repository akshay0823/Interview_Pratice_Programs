package Java_SMT.InterviewPractice;

import java.util.*;

public class wissenR2 {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String str = "Today Akshay Verma is Being interviewed";
//        TreeMap<Character, Integer> mp = new TreeMap<>();
        LinkedHashMap<Character, Integer> mp = new LinkedHashMap<>();
        for (char ch : str.toLowerCase().toCharArray()) {
            if (ch != ' ')
                mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> sortedList = new ArrayList<>(mp.entrySet());
        sortedList.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        for (Map.Entry<Character, Integer> chr : sortedList) {
            if (chr.getValue() > 1) {
                System.out.println("Key " + chr.getKey() + "  Value " + chr.getValue());
            }
        }

    }
}

