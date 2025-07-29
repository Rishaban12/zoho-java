public class Five {

    public static int sumOfEvenNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                continue;  // Skip odd numbers
            }
            sum += i;  // Add even numbers
        }
        return sum;
    }

    public static void main(String[] args) {
        int n = 10; // You can also take user input
        int result = sumOfEvenNumbers(n);
        System.out.println("Sum of even numbers from 1 to " + n + " is: " + result);
    }
}
