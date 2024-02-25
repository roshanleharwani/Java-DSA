package Array;

public class LeadersOfTheArray {

    public static void main(String[] args) {

        int arr[] = { 50, 9, 30, 5, 4, 10, 14, 5, 9, 3 };

        int curr = arr[arr.length - 1];
        System.out.print(curr);
        System.out.print(" ");
        for (int i = arr.length - 2; i >= 0; i--) {

            if (arr[i] > curr) {
                System.out.print(arr[i]);
                System.out.print(" ");
                curr = arr[i];
            }

        }
    }

}
