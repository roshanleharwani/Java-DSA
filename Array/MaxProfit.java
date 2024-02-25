package Array;

public class MaxProfit {

    public static void main(String[] args) {

        int arr[] = { 30, 20, 10 };
        int maxProfit = 0;

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > arr[i - 1]) {
                maxProfit += (arr[i] - arr[i - 1]);
            }

        }
        System.out.println(String.format("Max Profit: %d", maxProfit));

    }
}
