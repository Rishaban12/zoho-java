class AtmDetails{
    int balance=10000;
    public synchronized void PIN(){
        System.out.println("Checking the pin");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("PIN verified");
    }
    public synchronized void casWithdraw(double amount){
        if(amount<=balance){
             balance-=amount;
            System.out.println("the withdrawal "+amount+" is successful");
        }
        else {
            System.out.println("insufficient balance");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
    public synchronized void balance(){
        System.out.println("printing balance");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("the remaining balance: "+balance);
    }
    public synchronized void receipt(){
        System.out.println("print the receipt");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("transaction complete");
    }
}

public class Atm {
    public static void main(String[] args) {
        AtmDetails atm=new AtmDetails();

        Thread th1=new Thread(()-> atm.PIN());
        Thread th2=new Thread(()-> atm.casWithdraw(5000));
        Thread th3=new Thread(()-> atm.balance());
        Thread th4=new Thread(()-> atm.receipt());

        th1.start();
        try{
            th1.join();
        } catch (InterruptedException e) {

        }
        th2.start();
        try{
            th2.join();
        } catch (InterruptedException e) {

        }
        th3.start();
        try{
            th3.join();
        } catch (InterruptedException e) {

        }
        th4.start();
    }
}
