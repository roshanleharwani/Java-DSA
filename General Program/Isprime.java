import java.util.Scanner;

public class Isprime {

    public static Boolean isPrime(int num) {
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.println(isPrime(num));
        input.close();
    }
}