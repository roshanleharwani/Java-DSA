package Array;

public class ArraySortedOrNot {
    public static void main(String[] args) {

        int arr[] = { 5, 12, 30, 2, 35 };
        boolean flag = true;
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                System.out.println("Not Sorted");
                flag = false;
                break;
            }

        }

        if (flag) {
            System.out.println("Sorted");
        }

    }
}
