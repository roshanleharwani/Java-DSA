import java.util.Scanner;

public class Facrtorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        input.close();
        if (num < 0) {
            System.out.println("The Number is invalid !!");
            return;
        }
        int f = fact(num);
        System.out.println("The factorial of " + num + " is " + f);
    }

    static int fact(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fact(n - 1);

    }
}
