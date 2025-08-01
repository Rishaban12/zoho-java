import java.io.*;
import java.util.*;
class Student implements Serializable{
    String name;
    int id;
    Student(String name, int id){
        this.name=name;
        this.id=id;
    }
    public String toString(){
        return "Student{name:"+name+",id:"+id+"}";
    }
}
public class Serialise {
    public static void main(String[] args) throws IOException,ClassNotFoundException{
        Student s=new Student("rishab", 12);
        FileOutputStream fos= new FileOutputStream("file.txt");
        ObjectOutputStream oos= new ObjectOutputStream(fos);

            oos.writeObject(s);
            oos.close();

        FileInputStream fis= new FileInputStream("file.txt");
        ObjectInputStream ois= new ObjectInputStream(fis);

            Student s1 = (Student) ois.readObject();
            ois.close();
        System.out.println(s1);
    }

}
