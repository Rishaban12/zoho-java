import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lessThan18 = 0;
        int between18And60 = 0;
        int greaterThan60 = 0;

        System.out.println("Enter the ages of 10 people:");
int[] arr=new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();

            if (arr[i] < 18) {
                lessThan18++;
            } else if (arr[i] <= 60) {
                between18And60++;
            } else {
                greaterThan60++;
            }
        }

        System.out.println("\nAge group counts:");
        System.out.println("People under 18: " + lessThan18);
        System.out.println("People between 18 and 60: " + between18And60);
        System.out.println("People over 60: " + greaterThan60);
    }
}

