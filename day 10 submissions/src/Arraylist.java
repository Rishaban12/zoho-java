import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String> colours=new ArrayList<>();
        colours.add("red");
        colours.add("blue");
        colours.add("green");
        colours.add("white");
        Iterator<String> color= colours.iterator();
        System.out.println("original arrayList\n");
        while(color.hasNext()){
            System.out.println("colours are: "+color.next());
        }
        colours.add(0,"yellow");
        System.out.println("added: "+colours);
        String s=colours.get(1);
        System.out.println("retrieved: "+s);
        String t=colours.set(2,"pink");
        System.out.println("updated the 2nd element: "+t);
        colours.remove(3);
        System.out.println("Removed the 3rd element: "+colours);
        if(colours.contains("yellow")){
            System.out.println("Element(yellow) found in the list ");
        }

        Collections.sort(colours);
        System.out.println("sorted: "+colours);
        Collections.shuffle(colours);
        System.out.println("Shuffle: "+colours);
        ArrayList<String>copy=new ArrayList<>();
        copy.addAll(colours);
        System.out.println("Copied List: " + copy);
    }
}
