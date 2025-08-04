import java.util.Scanner;

class customer {
    private String name;
    private int customerId;
    private long infoContact;

    void setUserDetails(String name, int customerId, long infoContact) {
        this.name = name;
        this.customerId = customerId;
        this.infoContact = infoContact;
    }

    int getCustomerId() {
        return customerId;
    }

    String getName() {
        return name;
    }

    long getInfoContact() {
        return infoContact;
    }

    void userDisplay() {
        System.out.println("customerId: " + customerId);
        System.out.println("Name: " + name);
        System.out.println("infoContact: " + infoContact);
    }
}
class account {
    private long accountNumber;
    private String accountType;
    private double balance;

    void setAccountDetails(long accountNumber, String accountType, double balance) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    long getAccountNumber() {
        return accountNumber;
    }

    String getAccountType() {
        return accountType;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("deposited successfully: " + balance);
        } else {
            System.out.println("invalid deposit amount");
        }
    }

    void withdrawal(double amount, int withdrawalLimit) {
        if (amount > 0 && amount <= balance && amount<=withdrawalLimit) {
            balance = balance - amount;
            System.out.println("withdrawal successfully: " + balance);
        } else {
            System.out.println("Invalid withdrawal amount");
        }
    }
    void interestRate(double rate, int time){
        double interest=(balance*rate*time)/100;
        System.out.println("InterestRate is: "+ interest);
    }
}
abstract class RBI{
    customer c;
    account a;
    abstract double getInterestrate();
    abstract double getWithdrawalLimit();
}
 class Sbi extends RBI{
     Sbi(customer c,account a){
          this.c=c;
          this.a=a;
     }

     @Override
     double getInterestrate() {
         return 4;
     }

     @Override
     double getWithdrawalLimit() {
         return 90000;
     }
 }
class Icic extends RBI{
    Icic(customer c,account a){
        this.c=c;
        this.a=a;
    }

    @Override
    double getInterestrate() {
        return 4.5;
    }

    @Override
    double getWithdrawalLimit() {
        return 80000;
    }
}
public class Bank {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
          customer cus=new customer();
          cus.setUserDetails("rishab",111,999999);
          account acc=new account();
          acc.setAccountDetails(8765731,"savings",100000);
          cus.userDisplay();

        System.out.println("AccountNumber: "+acc.getAccountNumber());
        System.out.println("AccountType: "+acc.getAccountType());


        System.out.println("Enter your bank");
        System.out.println("choice 1: Sbi");
        System.out.println("choice 2: Icic");
        System.out.println("choice 3: Exit");
        int choice=read.nextInt();
        RBI bank=null;
        if(choice==1){
             bank=new Sbi(cus,acc);
            System.out.println("Your selected the SBI");
        }
        else if(choice==2){
            bank=new Icic(cus,acc);
            System.out.println("Your selected the ICIC");
        }
        else{
            System.out.println("exit");
            return;
        }
        System.out.println("enter your deposit amount");
        double amount=read.nextLong();
        bank.a.deposit(amount);

        System.out.println("enter your withdrawal amount");
        double amounts=read.nextLong();
        bank.a.withdrawal(amount, (int) bank.getWithdrawalLimit());

        System.out.println("Enter the years for your interest");
        int time=read.nextInt();
        bank.a.interestRate(bank.getInterestrate(), time);

        System.out.println("Final balance is: "+bank.a.getBalance());
    }
}
