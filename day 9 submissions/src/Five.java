
public class Five {
    int method() {
        try {
            System.out.println("try block");
            return 10;
        } finally {
            System.out.println("finally block");
        }
    }
    public static void main(String[] args) {
     Five five=new Five();
     int res= five.method();
        System.out.println(res);
    }
}
