package Array;

import java.util.Arrays;

public class LeftRotateOfArrayDTimes {
    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int d = 2;

        int temp[] = new int[d];

        for (int i = 0; i < d; i++) {

            temp[i] = arr[i];

        }

        for (int j = d; j < arr.length; j++) {

            arr[j - d] = arr[j];

        }

        for (int k = 0; k < d; k++) {

            arr[arr.length - d + k] = temp[k];

        }

        System.out.println(Arrays.toString(arr));

    }

}