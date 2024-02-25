package Recursion;

public class JosephusProblem {
    public static void main(String[] args) {
        System.out.println(solution(9, 3));
    }

    static int solution(int n, int k) {
        if (n == 1) {
            return 0;
        } else {
            return (solution(n - 1, k) + k) % n;
        }
    }

}
