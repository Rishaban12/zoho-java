import java.util.Scanner;

class accountDetails{
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    void setAccountDetails(long accountNumber,String accountHolderName,double balance){
        this.accountNumber=accountNumber;
        this.accountHolderName=accountHolderName;
        this.balance=balance;
    }
    long getAccountNumber(){
        return accountNumber;
    }
    String getAccountHolderName(){
        return accountHolderName;
    }
    double getBalance(){
        return balance;
    }
    void deposit(double amount){
        if(amount>0){
            balance=balance+amount;
            System.out.println("deposited successfully: "+ balance);
        }else{
            System.out.println("invalid deposit amount");
        }
    }
    void withdrawal(double amount){
        if(amount>0 && amount<=balance){
            balance=balance-amount;
            System.out.println("withdrawal successfully: "+ balance);
        }else{
            System.out.println("Invalid withdrawal amount");
        }
    }


}
public class BankAccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        accountDetails bank = new accountDetails();

        System.out.print("Enter Account Number: ");
        long accNo = sc.nextLong();

        sc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();

        bank.setAccountDetails(accNo, name, initialBalance);

        System.out.println("\nAccount Created Successfully!");
        System.out.println("AccountNumber: " + bank.getAccountNumber());
        System.out.println("AccountHolderName: " + bank.getAccountHolderName());
        System.out.println("BankBalance: " + bank.getBalance());



        System.out.println("\nWhat do you want to do?");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter amount to deposit: ");
            double depositAmt = sc.nextDouble();
            bank.deposit(depositAmt);
        } else if (choice == 2) {
            System.out.print("Enter amount to withdraw: ");
            double withdrawAmt = sc.nextDouble();
            bank.withdrawal(withdrawAmt);
        } else {
            System.out.println("Invalid choice!");
        }

        sc.close();
    }
}
