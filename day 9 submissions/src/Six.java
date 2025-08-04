import java.util.Scanner;


public class Six {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("enter the PIN: ");
        String pin = read.next();
        try{
            pinNumber(pin);
            System.out.println("PIN is valid");
        }catch (Exception e){
            System.out.println("PIN is invalid: "+e.getMessage());
        }
    }

   static void pinNumber(String pin) throws Exception{
              if(pin.length()!=4){
                  throw new Exception("PIN must be a 4 digits only");
           }
              if(pin.charAt(0)=='0'){
                  throw new Exception("Starting value doesn't have zero");
              }
              for(int i=0;i<pin.length();i++){
                  if(!Character.isDigit(pin.charAt(i))){
                      throw new Exception("Only numeric values");
                  }
              }
}
 }