package Searching;

public class Triplet {
    public static void main(String[] args) {
        int[] arr = {2,5,10,15,18};
        System.out.println(isTriplet(arr,15));

    }

    static boolean isTriplet(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            int start = i+1;
            int end = arr.length-1;
            while (start <= end) {
                if (arr[start] + arr[end] == x - arr[i]) {
                    System.out.println(arr[start]+" "+arr[end]+" "+arr[i]);
                    return true;
                } else if (arr[start] + arr[end] > x - arr[i]) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return false;
    }
}
