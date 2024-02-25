import java.util.Scanner;

public class Sumofnaturalnumber {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = input.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum of the Natural Number is " + sum);
        input.close();
    }
}