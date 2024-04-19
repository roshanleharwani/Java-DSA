package Searching;

public class MinimimumPages {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int k = 2;
        System.out.println(minPages(arr, k));
    }

    static int minPages(int[] arr, int k) {
        int n = arr.length;
        if (n < k)
            return -1; // Not possible to allocate books

        int start = getMax(arr); // Minimum possible pages a student can read
        int end = getSum(arr); // Maximum possible pages a student can read

        int result = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(arr, n, k, mid)) {
                result = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    // Function to check if it's possible to allocate books such that
    // maximum pages a student reads is less than or equal to 'max'
    static boolean isPossible(int[] arr, int n, int k, int max) {
        int studentsRequired = 1;
        int pages = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max)
                return false;

            if (pages + arr[i] > max) {
                studentsRequired++;
                pages = arr[i];
            } else {
                pages += arr[i];
            }

            if (studentsRequired > k)
                return false;
        }

        return true;
    }

    static int getMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int val : arr) {
            max = Math.max(max, val);
        }
        return max;
    }

    static int getSum(int[] arr) {
        int sum = 0;
        for (int val : arr) {
            sum += val;
        }
        return sum;
    }
}
