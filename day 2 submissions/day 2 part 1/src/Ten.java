import java.util.Scanner;

public class Ten {

    // 1. Input Elements
    public static void inputMatrix(int[][] matrix, int m, int n, Scanner sc) {
        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
    }

    // 2. Display Matrix
    public static void displayMatrix(int[][] matrix, int m, int n) {
        System.out.println("Matrix:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // 3. Sum of All Elements
    public static void totalSum(int[][] matrix, int m, int n) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int val : row) {
                sum += val;
            }
        }
        System.out.println("Sum of all elements: " + sum);
    }

    // 4. Row-wise Sum
    public static void rowWiseSum(int[][] matrix, int m, int n) {
        System.out.println("Row-wise sum:");
        for (int i = 0; i < m; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += matrix[i][j];
            }
            System.out.println("Row " + i + ": " + rowSum);
        }
    }

    // 5. Column-wise Sum
    public static void columnWiseSum(int[][] matrix, int m, int n) {
        System.out.println("Column-wise sum:");
        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < m; i++) {
                colSum += matrix[i][j];
            }
            System.out.println("Column " + j + ": " + colSum);
        }
    }

    // 6. Transpose of Matrix
    public static void transposeMatrix(int[][] matrix, int m, int n) {
        System.out.println("Transpose:");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Main Method with Menu
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows (m): ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns (n): ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Input Matrix");
            System.out.println("2. Display Matrix");
            System.out.println("3. Total Sum of Matrix");
            System.out.println("4. Row-wise Sum");
            System.out.println("5. Column-wise Sum");
            System.out.println("6. Transpose of Matrix");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1: inputMatrix(matrix, m, n, sc); break;
                case 2: displayMatrix(matrix, m, n); break;
                case 3: totalSum(matrix, m, n); break;
                case 4: rowWiseSum(matrix, m, n); break;
                case 5: columnWiseSum(matrix, m, n); break;
                case 6: transposeMatrix(matrix, m, n); break;
                case 7: System.out.println("Exiting program."); break;
                default: System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 7);
    }
}
