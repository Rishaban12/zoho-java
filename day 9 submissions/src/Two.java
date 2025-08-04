import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor;

public class Two {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);

        try{
            System.out.println("enter the two numbers: ");
            String a=read.next();
            String b=read.next();

            int A=Integer.parseInt(a);
            int B=Integer.parseInt(b);

        }catch (ArithmeticException e){
            System.out.println("Division by zero is the error");
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("Dont give alphabets, pls provide the integer");
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("This is the error, pls provide the integer");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("program is ended");
        }
        read.close();
    }
}
