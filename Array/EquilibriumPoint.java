package Array;

public class EquilibriumPoint {

    public static void main(String[] args) {

        int arr[] = { 3, 4, 8, -9, 9, 7 };
        int sums[] = new int[arr.length];
        sums[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sums[i] = sums[i - 1] + arr[i];
        }
        if (sums[arr.length - 1] - sums[0] == 0 || sums[arr.length - 2] == 0) {
            System.out.println(true);
            return;
        }
        for (int i = 1; i < arr.length - 1; i++) {

            if (sums[i - 1] == (sums[arr.length - 1] - sums[i])) {
                System.out.println(true);
                System.out.println(i);
                return;
            }

        }
        System.out.println(false);
    }
}
