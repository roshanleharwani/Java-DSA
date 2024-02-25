import java.util.Scanner;

public class Divisors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        input.close();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
