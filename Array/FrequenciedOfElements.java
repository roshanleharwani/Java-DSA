package Array;

public class FrequenciedOfElements {
    public static void main(String[] args) {

        int arr[] = { 10, 20, 30 };
        int curr = arr[0];
        int currFreq = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == curr) {

                currFreq++;

            } else {
                System.out.println(String.format("%d %d", arr[i - 1], currFreq));
                curr = arr[i];
                currFreq = 1;
            }
        }
        System.out.println(String.format("%d %d", curr, currFreq));
    }
}
