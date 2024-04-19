package Searching;

public class RotatedSortedArray {
    public static void main(String[] args) {

        int[] arr = {100, 200, 500, 1000, 2000, 10, 20};
        System.out.println(search(arr, arr.length, 10));

    }

    static int search(int[] arr, int n, int x) {
        int low = 0;
        int high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                return mid;
            }
            // Check if the left half is sorted
            if (arr[low] <= arr[mid]) {
                if (arr[low] <= x && x < arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            // Else, the right half is sorted
            else {
                if (arr[mid] < x && x <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

}
