package Searching;

public class CountOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 2, 2, 2, 2, 2, 4, 4, 4, 8, 8, 9};
        System.out.println(frequency(arr,8));
    }

    static int frequency(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;
        int firstOccurence = FirstOccurence.search(arr,low,high,x);//log(n)
        if (firstOccurence==-1){
            return 0;
        }
        else{
            return (LastOccurence.search(arr,low,high,x)-firstOccurence+1);//log(n)
        }


    }

}
