package Recursion;
public class SumOfDigit {
    public static void main(String[] args) {
        int n = 5421;
        System.out.println(getSum(n));
    }

    static int getSum(int n) {
        if (n == 0) {
            return 0;
        } else {
            int lastDigit = n % 10;
            return lastDigit + getSum(n / 10);
        }
    }
}
