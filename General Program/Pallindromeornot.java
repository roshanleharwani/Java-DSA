import java.util.Scanner;

public class Pallindromeornot {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int temp = num;
        int rev = 0;
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }
        if (rev == temp) {
            System.out.println("Palindrome ");

        } else {
            System.out.println("Not Palindrome ");
        }
        input.close();
    }
}
