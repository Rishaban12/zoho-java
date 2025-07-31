import java.util.*;
class twoD {
    private int x;
    private int y;

    twoD() {
        System.out.println("twoD Default constructor");
    }

    twoD(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println("twoD default constructor with two arguments");
    }

    void setX(int x) {
        this.x = x;
    }

    void setY(int y) {
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }
}
class threeD extends twoD {
    private int z;

    threeD() {
        super();
    }

    threeD(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    void setZ(int z) {
        this.z = z;
    }

    int getZ() {
        return z;
    }

    void findDistance(threeD that) {
        int dx=that.getX()-this.getX();
        int dy=that.getY()-this.getY();
        int dz= that.getZ()-this.getZ();
        double distance = Math.sqrt((dx) ^ dx+ (dy) ^ dx+ (dz) ^ dx);
        System.out.println(distance);
    }
}
    public  class maintwo{
        public static void main(String[] args){
           threeD obj1= new threeD();
           threeD obj2= new threeD(8,9,19);
           obj1.setX(3);
           obj1.setY(5);
           obj1.setZ(9);
           obj1.findDistance(obj2);
        }
    }

