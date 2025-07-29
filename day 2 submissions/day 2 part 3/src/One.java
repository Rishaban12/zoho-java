import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input three numbers
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        int min = a;

        if (b < min) {
            min = b;
        }

        if (c < min) {
            min = c;
        }

        System.out.println("The minimum of the three numbers is: " + min);

        sc.close();
    }
}

