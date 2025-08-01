class Parent{
    Parent(){
        System.out.println("parent constructor");
    }
    static void display(){
        System.out.println("static method parent");
    }
    private void show(){
        System.out.println("Parent");
    }
    final void message(){
        System.out.println("hello" );
    }
}
class Child extends Parent{
    Child(){
        System.out.println("child constructor");
    }
    static void display(){
        System.out.println("static method child");
    }
    private void show(){
        System.out.println("child");
    }
   /* final void message(){
        System.out.println("Hi");
    }*/
}
public class PrivateMethods {
public static void main(String[] args){
    Child ch=new Child();
    Parent p=new Child();//static
     p.display();
     //p.show();
}
           // 2. Can we override private method, constructor, static method, final method? Illustrate with an example.
}
