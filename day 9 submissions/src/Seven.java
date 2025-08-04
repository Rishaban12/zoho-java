public class Seven {
    void method1(){
        try{
            method2();
            System.out.println("Program is executed");
        }catch (ArithmeticException e){
            System.out.println("this is an error"+e.getMessage());
        }
    }
    void method2(){
         method3(18,9);
    }
    void method3(int a,int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Error: Division by zero");
        }else{
            int division =a/b;
            System.out.println("answer: "+division);
        }
    }
    public static void main(String[] args) {
         Seven error=new Seven();
         error.method1();
    }
}

