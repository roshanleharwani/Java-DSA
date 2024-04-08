package Searching;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10,12,1,4,16,17};
        System.out.println(search(arr,0,arr.length-1,6));
    }
    static int search(int[] arr,int low,int high ,int x){

        int mid = (low+high)/2;
        if(arr[mid]==x){
            return mid;
        }
        else if(low == high) {
            return -1;
        }
        else{
            if(arr[mid]>x){
                return search(arr,low,mid-1,x);
            }
            else{
                return search(arr,mid+1,high,x);
            }
        }
    }
}
