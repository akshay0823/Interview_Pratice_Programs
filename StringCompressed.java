package Java_SMT.InterviewPractice;

public class StringCompressed {
    public static String compress(String str){
        if(str.length()==0 || str==null) return str;
        int count =1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                sb.append(str.charAt(i - 1)).append(count);
                count = 1; // reset
            }
        }
           sb.append(str.charAt(str.length()-1)).append(count);
        return sb.length() < str.length() ? sb.toString() : str;
    }
    public static void main(String[] args) {
        String input = "aabcccccaaa";
        String result = compress(input);
        System.out.println("Compressed string: " + result);
    }
}
