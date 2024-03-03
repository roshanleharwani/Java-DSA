package Array;

public class MaxSumCircularSubarray {
    public static void main(String[] args) {

        int arr[] = { 5, -2, 3, 4 };
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int curr_max = arr[i];
            for (int j = 1; j < arr.length; j++) {
                int index = (i + j) % arr.length;
                curr += arr[index];
                curr_max = Math.max(curr_max, curr);
            }

            max = Math.max(max, curr_max);
        }
        System.out.println(max);

    }
}
