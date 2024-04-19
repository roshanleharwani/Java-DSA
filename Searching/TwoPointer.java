package Searching;

public class TwoPointer {
    public static void main(String[] args) {
        int[] arr = {2,5,8,12,30};
        System.out.println(requiredPair(arr,7));
    }
    static boolean requiredPair(int[] arr , int x){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            if (arr[start]+arr[end] == x){
                return true;
            }
            if(arr[start]+arr[end] > x){
                end--;
            }
            else{
                start++;
            }
        }
        return false;
    }
}
