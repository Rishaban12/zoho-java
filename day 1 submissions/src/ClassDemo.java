
import java.util.Scanner;
public class ClassDemo{
    int rollNo;
    String department;
    String name;
    int age;
    static String collegeName;
    double percentage;
    double total;
    double mark1;
    double mark2;


    ClassDemo(String name, int age){
        this.name=name;
        this.age=age;

    }

    ClassDemo(ClassDemo obj){
        ClassDemo xobj=obj;
        xobj.showDetails();
    }

    void showDetails(){
        System.out.println("student login");
        System.out.println(rollNo+"\t"+department+"\t"+name+"\t"+collegeName+"\t"+age+"\t"+mark1+"\t"+mark2+"\t"+percentage);
    }

    void percentage(){
        total= mark1+mark2;
        percentage=(double) (total/2);
    }

    void details(){
        Scanner read= new Scanner(System.in);
        System.out.println("Enter your Roll No : ");
        rollNo=read.nextInt();
        System.out.println("enter department: ");

        department=read.next();
        System.out.println("Enter your name : ");

        name=read.next();
        System.out.println("Enter your college : ");

        collegeName=read.next();
        System.out.println("Enter your mark1 : ");

        mark1=read.nextDouble();
        System.out.println("Enter your mark2 : ");

        mark2=read.nextDouble();
    }


    public static void main(String[] args){
        ClassDemo obj=new ClassDemo("Rishaban", 22);
        ClassDemo cd=new ClassDemo(obj);
        obj.details();
        obj.showDetails();
        obj.percentage();
        ClassDemo.collegeName="mmm";
    }
}






