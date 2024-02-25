import java.util.Scanner;

public class Trailingzeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = input.nextInt();
        int zeros = 0;
        for (int i = 5; i <= num; i = i * 5) {
            zeros += num / i;
        }
        System.out.println("Number of Trialling Zeros are: " + zeros);
        input.close();
    }
}
