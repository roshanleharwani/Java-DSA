package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {11,28,35,46,55,65,87,98};

        System.out.println(search(arr,arr.length,46));

    }
    static int search(int[] arr,int n,int x){
        int low = 0;
        int high = n-1;
        int mid = (low+high)/2;
        while(low<=high){
            if (arr[mid]==x){
                return mid;
            }
            else if(arr[mid]>x){
                high = mid-1;
            } else if (arr[mid]<x) {
                low = mid+1;
            } 
        }return -1;
    }
}
