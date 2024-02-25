package Recursion;
public class Solution {
    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n) {
        if (n == 0) {
            return;
        } else {
            fun(n / 2);
            System.out.println(n % 2);
        }
    }
}
