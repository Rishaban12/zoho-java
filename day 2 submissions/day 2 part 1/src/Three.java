import java.util.Scanner;
public class Three {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(a);

            int next = a + b;
            a = b;
            b = next;
            read.close();
        }
    }
}
