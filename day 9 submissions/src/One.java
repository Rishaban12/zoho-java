public class One {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 4, 0, 7};
        try {
            int quotient = arr[7] / arr[4];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array is out of index");
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("division by zero");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("program is ended");
        }
    }
}
