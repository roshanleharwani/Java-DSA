public class Gcd {
    public static void main(String[] args) {
        int a = 15;
        int b = 25;
        // int num = Math.min(a, b);
        // for (int i = num; i >= 1; i--) {
        // if (a % i == 0 && b % i == 0) {
        // System.out.println("Greatest common divisor is : " + i);
        // break;
        // }

        // }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        System.out.println(a);
    }
}
