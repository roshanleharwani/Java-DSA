package Array;

public class SecondLargest {
    public static void main(String[] args) {

        int arr[] = { 5, 20, 12, 20, 8 };
        int largest = 0;
        int result = -1;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > arr[largest]) {
                result = largest;
                largest = i;
            } else if (arr[i] < arr[largest]) {
                if (result == -1) {
                    result = i;
                } else if (arr[i] > arr[result]) {
                    result = i;
                }
            }
        }

        System.out.println(String.format("Second largest index: %d", result));

    }

}