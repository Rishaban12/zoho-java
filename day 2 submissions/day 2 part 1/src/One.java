import java.util.Scanner;
public class One {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int sum=0;
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = read.nextInt();
            if (arr[i] % 2 == 0) {
                   sum+=arr[i];
            }
        }
        System.out.println(sum);
    }
}
