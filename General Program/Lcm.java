public class Lcm {
    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        int num = Math.max(a, b);
        while (true) {
            if (num % a == 0 && num % b == 0) {
                System.out.println(num);
                return;
            }
            num++;
        }

    }
}
