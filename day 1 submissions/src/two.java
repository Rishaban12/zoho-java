public class two {
    // instance variables
    int no1 = 12;
    double no2 = 12.00;
    float no3 = 12.00f;
    long integer = 200000L;
    char initial = 'R';
    byte data = -111;
    short minus = -22367;

    public static void main(String[] args) {
        two obj = new two();

        System.out.println("int: " + obj.no1);
        System.out.println("double: " + obj.no2);
        System.out.println("float: " + obj.no3);
        System.out.println("long: " + obj.integer);
        System.out.println("char: " + obj.initial);
        System.out.println("byte: " + obj.data);
        System.out.println("short: " + obj.minus);
    }
}
