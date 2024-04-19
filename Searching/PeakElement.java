package Searching;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {15, 10, 20, 15, 7, 90, 10};
        System.out.println(peak(arr,arr.length));

    }

    static int peak(int[] arr, int n) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low+high)/2;
            if((mid==0 || arr[mid]>arr[mid-1]) && mid == n-1 || arr[mid]>arr[mid+1]) {
                return arr[mid];
            }
            if(mid > 0 && arr[mid-1]>= arr[mid]){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
}