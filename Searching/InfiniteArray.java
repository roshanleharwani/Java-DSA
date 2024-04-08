package Searching;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] array = {
                12, 24, 35, 40, 45, 48, 50, 52, 54, 60,
                63, 65, 70, 73, 76, 80, 82, 84, 87, 90,
                92, 95, 100, 102, 105, 110, 112, 115, 118, 120,
                122, 125, 128, 130, 135, 138, 140, 143, 145, 148,
                150, 155, 158, 160, 165, 170, 175, 180, 185, 190
        };
        System.out.println(search(array, 190));
    }

    static int search(int[] arr, int x) {
        if (arr[0] == x) {
            return 0;
        }
        int i = 1;
        while (true) {
            if (arr[i] == x) {
                return i;
            } else if (arr[i] > x) {
                while (arr[i] >= x) {
                    if (arr[i] == x) {
                        return i;
                    }

                    i--;
                }
                return -1;
            }
            if (i * 2 <= arr.length-1) {
                i *= 2;
            } else {
                i = arr.length-1;

            }

        }
    }
}
