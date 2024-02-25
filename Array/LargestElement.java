package Array;

public class LargestElement {
    public static void main(String[] args) {

        int arr[] = { 10, 40, 91, 54, 72, 100 };

        int maxIndex = getMaxIndex(arr);
        System.out.println(String.format(" maximum element index: %d", maxIndex));

    }

    public static int getMaxIndex(int[] arr) {
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }

        }
        return maxIndex;
    }
}
