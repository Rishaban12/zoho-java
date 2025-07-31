class Shape{
    void method(){
        System.out.println("this is a shape");
    }
}
class Polygon extends Shape{
    void method(){
        System.out.println("Polygon is a shape");
    }
}
class Rectangle extends Polygon{
    void method(){
        System.out.println("Rectangle is a Polygon");
    }
}
class Triangle extends Polygon{
    void method(){
        System.out.println("Triangle is a Polygon");
    }
}
class Square extends  Rectangle{
    void method(){
        System.out.println("Square is a Polygon");
    }
}
public class Shapes {
    public static void main(String[] args){
        Shape obj= new Shape();
        obj.method();
        Shape obj1= new Polygon();
        obj1.method();
        Rectangle obj2= new Rectangle();
        obj2.method();
        Triangle obj3= new Triangle();
        obj3.method();
        Square obj4= new Square();
        obj4.method();
    }
}
