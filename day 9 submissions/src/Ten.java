import java.util.Scanner;

class InvalidAgeException extends Exception{
    InvalidAgeException(String message){
        super(message);
    }
}
class Age{
    void check(int age) throws InvalidAgeException{

            if(!(age<18)){
                System.out.println("Eligible to vote");
            }else{
            throw new InvalidAgeException("Uneligible to vote");
        }
    }
}
public class Ten {
    public static void main(String[] args) throws InvalidAgeException {

        Scanner read = new Scanner(System.in);
        System.out.println("enter your age: ");
        int age = read.nextInt();
        Age vote = new Age();
        try {
            vote.check(age);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
