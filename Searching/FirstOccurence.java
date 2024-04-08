package Searching;

public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,2,2,2,2,4,4,4,8,8,9};
        System.out.println(search(arr,0,arr.length-1,9));

    }
    static int search(int[] arr , int low ,int high ,int x ){
        while(low<=high){
        int mid = (low+high)/2;
            if (arr[mid]>x){
                high = mid-1;
            }
            else if(arr[mid]<x){
                low= mid+1;
            }
            else{
                if(mid==0 || arr[mid-1]!=arr[mid]){
                    return mid;
                }
                else{
                    high = mid-1;
                }
            }
        }
        return -1;
    }
}

