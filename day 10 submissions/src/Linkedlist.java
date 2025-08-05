import java.util.LinkedList;
import java.util.Iterator;
import java.util.ListIterator;

public class Linkedlist {
    public static void main(String[] args) {
        LinkedList<String>colours=new LinkedList<>();
        colours.add("white");
        colours.add("pink");
        colours.add("blue");
        colours.addLast("yellow");
        Iterator<String>color= colours.iterator();
        System.out.println("Iterate the linkedlist");
        while(color.hasNext()){
            System.out.println("colours are: "+color.next());
        }
        ListIterator<String>color1= colours.listIterator(2);
        System.out.println("\ncolors are started from specific index at 2");
        while(color1.hasNext()){
            System.out.println("colours are : "+color1.next());
        }
        ListIterator<String> color2= colours.listIterator(colours.size());
        System.out.println("\ncolors are reverse in order");
        while(color2.hasPrevious()){
            System.out.println("colours are : "+color2.previous());
        }
        colours.set(1,"green");
        System.out.println("\ninsert the element in specified position: "+colours);
        colours.addFirst("black");
        System.out.println("\ninsert the element in first position: "+colours);
        colours.addLast("orange");
        System.out.println("\ninsert the element in last position: "+colours);
        colours.addFirst(colours.set(0,"purple"));
        System.out.println("\ninsert the specified element at the front: "+colours);
        colours.addLast(colours.set(5,"dark blue"));
        System.out.println("\ninsert the specified element at the last: "+colours);
        int indexFirst=colours.indexOf("orange");
        System.out.println("First occurrence of orange: Index " + indexFirst);
        int lastIndex=colours.lastIndexOf("dark blue");
        System.out.println("Last occurrence of dark blue: Index " + lastIndex);


    }
}
