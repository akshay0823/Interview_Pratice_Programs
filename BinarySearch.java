package Java_SMT.InterviewPractice;

public class BinarySearch {
    public static int searchNumber(int [] arr,int first,int last,int target){
        int mid = (first+last)/2;
        if(arr[mid]==target)
            return mid;
        if(arr[mid]>target)
            return searchNumber(arr,first,mid-1,target);
        if(arr[mid]<target)
           return searchNumber(arr,mid+1,last,target);
        return -1;
    }
    public static void main(String[] args) {
        int[] arr= {1,2,4,5,60,66,70,80,90};
        int target = 70;
        System.out.println(searchNumber(arr,0,arr.length,target));
    }
}
