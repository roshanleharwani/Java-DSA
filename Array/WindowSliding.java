package Array;

public class WindowSliding {
    public static void main(String[] args) {

        int arr[] = { 1, 8, 30, -5, 20, 7 };
        int k = 4;
        int res = 0;
        for (int i = 0; i < k; i++) {
            res += arr[i];
        }
        for (int i = 1; i <= arr.length - k; i++) {
            int curr = res + arr[i + k - 1] - arr[i - 1];
            res = Math.max(res, curr);

        }
        System.out.println(res);
    }
}
