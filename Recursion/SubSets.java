package Recursion;

public class SubSets {
    public static void main(String[] args) {
        String s = "abcdefgh";
        helper(s, "", 0);
    }

    static String helper(String s, String temp, int i) {
        if (i == s.length()) {
            System.out.println(temp);
            return "";
        } else {
            helper(s, temp + s.charAt(i), i + 1);
            helper(s, temp, i + 1);
            return "";
        }

    }
}