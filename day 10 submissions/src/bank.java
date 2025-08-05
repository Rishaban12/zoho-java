import java.util.ArrayList;

class Account{
    int accountNumber;
    String holderName;
    Double balance;

    Account(int accountNumber,String holderName,double balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=balance;
    }
}

public class bank{
    public static void main(String[] args) {
          double rate=0.05;
          Double interest=Double.valueOf(rate);

        ArrayList<Account> account=new ArrayList<>();

        account.add(new Account(12345617,"rishab",50000));
        account.add(new Account(132745617,"san",5000000));
        account.add(new Account(1261997,"thiya",5001200));
for(Account acc:account) {

    System.out.println("AccountNumber is: " + acc.accountNumber);
    System.out.println("Account Number: " + acc.accountNumber);
    System.out.println("Original Balance: " + acc.balance);

    double newBalance = acc.balance;
    double newInterest = interest.doubleValue();

    double interests = newInterest * newBalance;

    double curBalance = newBalance + interests;

    acc.balance = newBalance;

    System.out.println("AccBalance is: " + acc.balance);
}
    }
}