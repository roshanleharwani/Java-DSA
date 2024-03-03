package Array;

public class MajorityElement {
    public static void main(String[] args) {

        int arr[] = { 8, 3, 4, 8, 8, 8 };
        int count = 1;
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                count = 1;
                res = i;
            }
        }
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == arr[res]) {
                count++;
            }
        }
        res = (count > arr.length / 2) ? res : -1;
        System.out.println("index " + res);

    }
}
