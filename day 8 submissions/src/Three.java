import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Comparisons implements Comparable<Comparisons>{
    int id;
    String name;

    Comparisons(int id,String name){
        this.id=id;
        this.name=name;
    }
    void display(){
        System.out.println("ID: "+id+ " Name: "+name);
    }
    public int compareTo(Comparisons e){
        return this.id-e.id;
    }
}
public class Three{
    public static void main(String[] args) {
        ArrayList<Comparisons> emp=new ArrayList<>();

        emp.add(new Comparisons(14,"rishab"));
        emp.add(new Comparisons(22,"san"));
        emp.add(new Comparisons(11,"max"));

        System.out.println("before sorting\n");

        for(Comparisons n:emp){
            n.display();
        }

        Collections.sort(emp);
        System.out.println("\nAfter Sorting by Name:");
        for (Comparisons n : emp) {
            n.display();
        }
    }
}
