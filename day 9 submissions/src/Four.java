import java.util.Scanner;
public class Four {

    public static int parseInt(String str) throws NumberFormatException{
        int A = Integer.parseInt(str);
        return A;

    }
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("enter the number: ");
        String str = read.next();

        try {
          parseInt(str);
            System.out.println("converted to the integer successfully ");
        } catch (NumberFormatException e) {
            System.out.println("This is the error, pls provide the integer");
            System.out.println(e.getMessage());
        }
        read.close();
    }
}