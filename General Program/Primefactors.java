import java.util.Scanner;

class Primefactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        input.close();
        if (n <= 1) {
            return;
        }
        while (n % 2 == 0) {
            System.out.println(2);
            n /= 2;
        }
        while (n % 3 == 0) {
            System.out.println(3);
            n /= 3;
        }
        for (int i = 5; i * i <= n; i += 6) {
            while (n % i == 0) {
                System.out.println(i);
                n /= i;
            }
        }
        if (n > 1) {
            System.out.println(n);
        }
    }
}