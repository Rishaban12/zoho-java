import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] res = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < res.length; i++) {
            res[i] = read.nextInt();
        }

        System.out.println("Odd Prime Numbers:");
        for (int i = 0; i < res.length; i++) {
            if (res[i] % 2 != 0 && isPrime(res[i])) {
                System.out.println(res[i]);
            }
        }

    }

    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }
}
