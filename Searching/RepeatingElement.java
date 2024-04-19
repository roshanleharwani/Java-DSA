package Searching;

public class RepeatingElement {
    public static void main(String[] args) {
        int[] arr = {0,2,1,3,2,2};
        System.out.println(repeatedElement(arr));
    }
    static int repeatedElement(int[] arr) {
        boolean[] visited = new boolean[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
            if(!visited[arr[i]]) {
                visited[arr[i]] = true;
            }
            else{
                return arr[i];
            }
        }
        return -1;
    }
}
