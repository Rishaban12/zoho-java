class members{
    private int transactionId;
    private String payerName;
    private String payeeName;
    private double amount;
    private String paymentMethod;
    private String transactionStatus;

    void setMembers(int transactionId, String PayerName,String payeeName,double amount,String paymentMethod, String transactionStatus){
        this.transactionId=transactionId;
        this.payerName=payerName;
        this.payeeName=payeeName;
        this.amount=amount;
        this.paymentMethod=paymentMethod;
        this.transactionStatus=transactionStatus;
    }
    int gettransactionId(){
        return transactionId;
    }
    String getPayerName(){
        return payerName;
    }
    String getPayeeName(){
        return payeeName;
    }
    double getAmount(){
        return amount;
    }
    String getPaymentMethod(){
        return paymentMethod;
    }
    String getTransactionStatus(){
        return transactionStatus;
    }
    void display(){
        System.out.println("transactionId: "+transactionId);
        System.out.println("PayerName: "+payerName);
        System.out.println("payeeName: "+payeeName);
        System.out.println("amount: "+amount);
        System.out.println("paymentMethod: "+paymentMethod);
        System.out.println("transactionStatus: "+transactionStatus);
    }
}
public class PaymentGatewaySystem {
    public static void main(String[] args){
            members bank=new members();
            bank.setMembers(101,"rishab","san",100000.00,"gpay","success");
            bank.display();
    }
}
