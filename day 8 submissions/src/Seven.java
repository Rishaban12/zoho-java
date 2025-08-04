class Student{
    int id;
    String name;

    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return "ID: "+id+" Name: "+name;
    }
}
public class Seven {
    public static void main(String[] args) {
          Student s1=new Student(11,"rishab");
          Student s2=new Student(12,"san");

        System.out.println(s1);
        System.out.println(s2);
    }
}
