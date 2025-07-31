import java.util.Scanner;

class Point {
    private int x;
    private int y;

    Point() {
        x = 0;
        y = 0;
    } //default constructor

    void setPoint(int x, int y) {
        this.x = x;
        this.y = y;
    } //set coordinates

    int getX() {
        return x;
    } //get x coordinates

    int getY() {
        return y;
    } //get y coordinates

    void printPoint() {
        System.out.println("Circle Center is: " + x + "," + y);

    }
}
    class Circle extends Point {
        private float radius;


        Circle(int x, int y, float radius) {
            setPoint(x, y);
            setRadius(radius);
        }

        void setRadius(float radius) {
            if (radius <= 0) {
               this.radius = 1;
            } else {
                this.radius = radius;
            }
        }

        float getRadius() {
            return radius;
        }

        double areaOfCircle() {

            return 3.14 * radius * radius;
        }

        void printDetails() {
            printPoint();
            System.out.println("Radius is " + radius);
            System.out.println("Area is " + areaOfCircle());
        }
    }
    public class CircleRadius {
          public static void main(String[] args){
              Scanner sc = new Scanner(System.in);
              System.out.print("Enter x: ");
              int x = sc.nextInt();

              System.out.print("Enter y: ");
              int y = sc.nextInt();

              System.out.print("Enter radius: ");
              float r = sc.nextFloat();
              Circle circle = new Circle(x, y, r);
              circle.printDetails();
          }
        }

