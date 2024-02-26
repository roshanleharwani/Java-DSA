package Array;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {

        int arr[] = { 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1 };
        int tempMax = 0;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {

                tempMax += 1;

            } else if (arr[i] == 0) {

                res = Math.max(tempMax, res);
                tempMax = 0;

            }

        }
        System.out.println(String.format("Maximum Consecutive Ones is: %d ", res));
    }
}
