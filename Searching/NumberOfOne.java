package Searching;

public class NumberOfOne {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,1,1,1,1};
        System.out.println(count(arr));
    }
    static int count(int[] arr) {
        int n = arr.length;
        int index = LastOccurence.search(arr,0,n-1,0);
        if (index != n - 1) {
            return n-1 - index ;

        }
        return 0;
    }
}
