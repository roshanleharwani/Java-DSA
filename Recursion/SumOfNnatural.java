package Recursion;
public class SumOfNnatural {
    public static void main(String[] args) {

        int n = 5;
        System.out.println(sumOfNNaturalNumber(n));

    }

    static int sumOfNNaturalNumber(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n + sumOfNNaturalNumber(n - 1);
        }
    }
}
