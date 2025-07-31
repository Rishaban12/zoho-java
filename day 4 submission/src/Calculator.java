import java.util.Scanner;

class BasicCalculator{
    void add(int a, int b){
        int res=a+b;
        System.out.println("Add:"+res);
    }
    void subtract(int a, int b){
        int res=a-b;
        System.out.println("Subtract:"+res);
    }
    void multiply(int a, int b){
        int res=a*b;
        System.out.println("Multiply:"+res);
    }
    void divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
        } else {
            int res = a / b;
            System.out.println("Divide:" + res);
        }
    }
}
class AdvancedCalculator extends BasicCalculator{
    void power(int base, int exponent){
        double res=1;
        for(int i=0;i<exponent;i++){
            res*=base;
        }

        System.out.println("Power:"+res);
    }
    void modulus(int a, int b){
        int res=a%b;
        System.out.println("Modulus:"+res);
    }
    void squareRoot(double number) {
        if (number < 0) {
            System.out.println("Error: Negative number for square root!");
        } else {
            double res = Math.sqrt(number);
            System.out.println("Squareroot:" + res);
        }
    }
}
class ScientificCalculator extends AdvancedCalculator{
    void sin(double angle){
        double res=Math.sin(Math.toRadians(angle));
        System.out.println("Sin:"+res);
    }
    void cos(double angle){
        double res=Math.cos(Math.toRadians(angle));
        System.out.println("Cos:"+res);
    }
    void log(double value){
        if (value <= 0) {
            System.out.println("Error: Logarithm for non-positive number!");
        }else {
            double res = Math.log(Math.toRadians(value));
            System.out.println("Log:" + res);
        }
    }
    void exp(double value){
        double res=Math.exp(Math.toRadians(value));
        System.out.println("Exp:"+res);
    }
}
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ScientificCalculator calc = new ScientificCalculator();
        while (true) {
            System.out.println("1.add");
            System.out.println("2. subtract");
            System.out.println("3. multiply");
            System.out.println("4. divide");
            System.out.println("5. power");
            System.out.println("6. modulus");
            System.out.println("7. squareroot");
            System.out.println("8. sin");
            System.out.println("9. cos");
            System.out.println("10. log");
            System.out.println("11. exp");
            System.out.println("12. exit");
            System.out.println("enter the choice");
            int choice = sc.nextInt();

            if(choice==12){
                System.out.println("exit");
                break;
            }

        switch(choice){
            case 1:
                System.out.println("add two numbers");
                calc.add(sc.nextInt(),sc.nextInt());
                break;
            case 2:
                System.out.println("subtract two numbers");
                calc.subtract(sc.nextInt(),sc.nextInt());
                break;
            case 3:
                System.out.print("Enter two numbers: ");
                calc.multiply(sc.nextInt(), sc.nextInt());
                break;
            case 4:
                System.out.print("Enter two numbers: ");
                calc.divide(sc.nextInt(), sc.nextInt());
                break;
            case 5:
                System.out.print("Enter base and exponent: ");
                calc.power(sc.nextInt(), sc.nextInt());
                break;
            case 6:
                System.out.print("Enter two numbers: ");
                calc.modulus(sc.nextInt(), sc.nextInt());
                break;
            case 7:
                System.out.print("Enter a number: ");
                calc.squareRoot(sc.nextDouble());
                break;
            case 8:
                System.out.print("Enter angle in degrees: ");
                calc.sin(sc.nextDouble());
                break;
            case 9:
                System.out.print("Enter angle in degrees: ");
                calc.cos(sc.nextDouble());
                break;
            case 10:
                System.out.print("Enter value: ");
                calc.log(sc.nextDouble());
                break;
            case 11:
                System.out.print("Enter value: ");
                calc.exp(sc.nextDouble());
                break;
            default:
                System.out.println("Invalid choice. Please try again.");

        }
        }
    }
}