package Array;

import java.util.Arrays;

public class DuplicateElement {

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, 3, 4, 5, 6, 6, 7 };
        System.out.println(Arrays.toString(removeDuplicateElements1(arr)));
        removeDuplicateElements(arr);
        System.out.println(Arrays.toString(arr));
    }

    static int removeDuplicateElements(int arr[]) {
        int duplicateElements = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                delete(arr, arr[i], arr.length);
                duplicateElements += 1;
            }
        }
        return arr.length - duplicateElements;
    }

    static int[] removeDuplicateElements1(int arr[]) {

        int res[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[i + 1]) {
                continue;
            } else {
                res[i] = arr[i];
            }
        }
        return res;

    }

    static int delete(int[] arr, int x, int n) {
        int index = 0;
        boolean present = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                present = true;
                index = i;
            }
        }
        if (!present) {
            return n;
        } else {
            for (int i = index; i < n; i++) {
                if (i == n - 1) {
                    arr[i] = 0;
                }

                else {
                    arr[i] = arr[i + 1];
                }
            }
            return (n - 1);

        }
    }
}