import javax.naming.AuthenticationException;
import java.util.Scanner;

public class Eight {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the Username: ");
        String userName = read.next();
        System.out.println("Enter the Password: ");
        String password = read.next();

        try {
            // Check username
            if (!userName.equals("rishab")) {
                throw new AuthenticationException("Details are incorrect");
            } else {
                System.out.println("Username is correct");
            }

            // Check password
            if (!password.equals("Rishi123@")) {
                throw new AuthenticationException("Details are incorrect");
            } else {
                System.out.println("Password is correct");
            }

            System.out.println("Login Successful!");

        } catch (AuthenticationException e) {
            System.out.println("Login Failed: " + e.getMessage());
        }
    }
}
