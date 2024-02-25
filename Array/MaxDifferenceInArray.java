package Array;

public class MaxDifferenceInArray {

    public static void main(String[] args) {

        int arr[] = { 2, 3, 10, 6, 4, 8, 1 };

        int maxDifference = arr[1] - arr[0];
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {

            maxDifference = Math.max(maxDifference, arr[i] - minValue);
            minValue = Math.min(minValue, arr[i]);

        }
        System.out.println(String.format("Max Difference %d", maxDifference));

    }

}
