package Array;

public class MaxEvenOddLength {
    public static void main(String[] args) {

        int arr[] = { 5, 10, 20, 6, 3, 8 };
        int result = 1;
        int curr = 1;
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i] % 2 == 0 && arr[i - 1] % 2 != 0) || (arr[i] % 2 != 0 && arr[i - 1] % 2 == 0)) {
                curr++;
                result = Math.max(curr, result);
            } else {
                curr = 1;
            }
            result = Math.max(result, curr);

        }
        System.out.println(String.format("MaxEvenOddLength is: %d", result));
    }
}
