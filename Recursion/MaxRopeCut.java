package Recursion;

public class MaxRopeCut {
    public static void main(String[] args) {

        int n = 15;
        int a = 5;
        int b = 8;
        int c = 7;

        System.out.println(maxCut(n,a,b,c));

    }

    static int maxCut(int n, int a, int b, int c) {
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 0;
        } else {
            int res = Math.max(maxCut(n - a, a, b, c), Math.max(maxCut(n - b, a, b, c), maxCut(n - c, a, b, c)));
            if (res == -1) {
                return -1;

            } else {
                return res + 1;
            }
        }



    }

}