import java.util.Scanner;

public class ComputingPower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of X: ");
        int x = input.nextInt();
        System.out.print("Enter value of n: ");
        int n = input.nextInt();
        input.close();
        System.out.println(power(x, n));
    }

    static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }

        int temp = power(x, n / 2);
        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return power(x, n - 1) * x;
        }
    }
}
