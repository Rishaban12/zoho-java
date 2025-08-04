import java.util.Scanner;

interface PaymentMethod{
    void pay(double amount);
}
class CreditCardPayment implements PaymentMethod{
   public void pay(double amount){
        System.out.println("paid "+amount+" using creditcard");
    }
}
class DebitCardPayment implements PaymentMethod{
    public void pay(double amount){
        System.out.println("paid "+amount+" using debitcard");
    }
}
class UpiPayment implements PaymentMethod{
public void pay(double amount) {
    System.out.println("paid "+amount+" using UPI");
}
}

public class Payment {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("enter your payment method");
        System.out.println("1. creditcard");
        System.out.println("2. debitcard");
        System.out.println("3. UPI");
        int choice = read.nextInt();

        System.out.println("enter the amount to pay");
        long amount = read.nextLong();

        PaymentMethod p = null;
        switch (choice) {

            case 1:
                p = new CreditCardPayment();
                p.pay(amount);
                break;
            case 2:
                p = new DebitCardPayment();
                p.pay(amount);
                break;
            case 3:
                p = new UpiPayment();
                p.pay(amount);
                break;
            default:
                System.out.println("invalid");
                break;
        }
        read.close();
    }
}
