package Array;

public class PrefixSum {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int res = getSum(arr, 3, 6);
        System.out.println(res);
    }

    static int getSum(int arr[], int a, int b) {
        int preSumArray[] = new int[arr.length];
        preSumArray[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            preSumArray[i] = preSumArray[i - 1] + arr[i];
        }

        if (a == 0) {
            return preSumArray[b];
        }
        return preSumArray[b] - preSumArray[a - 1];
    }
}
