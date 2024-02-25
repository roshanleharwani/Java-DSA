package Array;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {

        int arr[] = { 10, 20, 0, 0, 12, 14, 15, 2, 5 };
        int count = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {

                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;

            }

        }
        System.out.println(Arrays.toString(arr));

    }
}
