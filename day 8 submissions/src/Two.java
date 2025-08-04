import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
    int id;
    String name;
    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println("ID: "+id+ " Name: "+name);
    }
}

class Comparison implements Comparator<Employee> {
    public int compare(Employee e1,Employee e2){
        return e1.name.compareTo(e2.name);
    }
}
public class Two{
    public static void main(String[] args) {
        ArrayList<Employee> emp=new ArrayList<>();

        emp.add(new Employee(14,"rishab"));
        emp.add(new Employee(22,"san"));
        emp.add(new Employee(11,"max"));

        System.out.println("before sorting\n");

        for(Employee n:emp){
            n.display();
        }

        Collections.sort(emp,new Comparison());
        System.out.println("\nAfter Sorting by Name:");
        for (Employee n : emp) {
            n.display();
        }
    }
}
