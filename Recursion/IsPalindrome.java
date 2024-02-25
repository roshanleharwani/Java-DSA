package Recursion;
public class IsPalindrome {
    public static void main(String[] args) {
        String s = "aabfbbaa";
        int start = 0;
        int end = s.length() - 1;
        System.out.println(isPalindromeOrNot(s, start, end));
    }

    static boolean isPalindromeOrNot(String s, int start, int end) {

        if (start >= end) {
            return true;
        } else {
            return (s.charAt(start) == s.charAt(end)) && (isPalindromeOrNot(s, start + 1, end - 1));
        }
    }

}
