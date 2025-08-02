package arithmetic;
public class calc{
  public void addition(int a, int b){
      int c=a+b;
      System.out.println("result: "+c);
  }
    public void subtraction(int a, int b){
        int c=Math.abs(a-b);
        System.out.println("result: "+c);
    }
    public void multiplication(int a, int b){
        double c=a*b;
        System.out.println("result: "+c);
    }
    public void division(int a, int b){
        double c=a/b;
        System.out.println("result: "+c);
    }
    public void modulus(int a, int b){
        int c=a%b;
        System.out.println("result: "+c);
    }
}