import java.util.Scanner;

public class Primenumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        float num = input.nextInt();
        if (primeOrNot(num)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
        input.close();

    }

    static Boolean primeOrNot(float n) {
        if (n == 1) {
            return false;
        } else if (n == 2 || n == 3) {
            return false;
        } else if (n % 2 == 0 && n % 3 == 0) {
            return false;
        } else {
            for (int i = 5; i * i <= n; i = i + 6) {
                if (n % i == 0) {
                    return false;
                }
            }
        }

        return true;

    }

}
