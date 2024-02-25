package Recursion;
public class Nto1 {
    public static void main(String[] args) {
        int k = 1;
        System.out.println(fact(5, k));
    }

    static int fact(int n, int k) {
        if (n == 1 || n == 0) {
            return k;
        } else {
            return fact(n - 1, k * n);
        }

    }
}
