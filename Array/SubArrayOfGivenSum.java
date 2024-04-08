package Array;

public class SubArrayOfGivenSum {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 0, 4, 7 };
        int sum = 12;
        for (int i = 0; i < arr.length; i++) {
            int currSum = 0;
            for (int j = i; j < arr.length; j++) {
                if (currSum == sum) {
                    System.out.println(true);
                    return;
                }
                currSum += arr[j];
            }
        }
    }
}
