import java.util.Scanner;

public class Countdigits {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int count = 0;
        while (num > 0) {
            count += 1;
            num /= 10;
        }
        System.out.print("The Number of Digits in given Number is: " + count);
        sc.close();

    }
}
