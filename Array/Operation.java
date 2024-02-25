package Array;

import java.util.Arrays;

class Operation {
    public static void main(String[] args) {

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
        delete(arr, 6, arr.length);
        System.out.println(Arrays.toString(arr));

    }

    static int insert(int[] arr, int n, int x, int cap, int pos) {
        if (n == cap) {
            return n;
        } else {
            int index = pos - 1;
            for (int i = n - 1; i <= index; i--) {
                arr[n + 1] = arr[i];
            }
            arr[index] = x;
            return n + 1;
        }

    }

    public static int delete(int[] arr, int x, int n) {
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