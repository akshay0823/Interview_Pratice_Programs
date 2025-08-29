package Java_SMT.InterviewPractice;

import org.w3c.dom.ls.LSOutput;

public class example {
    static int a=0;
    int b=1;
    public static void main(String[] args) {
//        System.out.println(a);
//        System.out.println(b);
    }
    public void example2() {
        System.out.println(a);
//        System.out.println(b);
    }
}
 class nerd extends example{
    public static void main(String[] args) {
        example obj = new example();
        System.out.println(a);
        System.out.println(obj.b);
    }
}
