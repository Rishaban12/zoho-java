import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityqueue {
    public static void main(String[] args) {
        PriorityQueue<String> colours=new PriorityQueue<>();
        colours.add("red");
        colours.add("blue");
        colours.add("green");
        colours.add("white");
        Iterator<String> color= colours.iterator();
        System.out.println("Iteration Priorityqueue\n");
        while(color.hasNext()){
            System.out.println("colours are: "+color.next());
        }
        PriorityQueue<String> colours1=new PriorityQueue<>(colours);
        System.out.println("\ncopied priorityqueue: "+colours1);
        colours.add("pink");
        System.out.println("\nelement inserted: "+colours);
        colours.remove("white");
        System.out.println("\nremoval: "+colours);
        PriorityQueue<String> tempQueue = new PriorityQueue<>(colours);
        tempQueue.clear();
        System.out.println("\nTempQueue after clear (empty): " + tempQueue);
       int size= colours.size();
        System.out.println("\nnumber of elements in there: "+size);
        if(colours.contains(colours1)){
            System.out.println("\nThey are equal");
        }
        else{
            System.out.println("\nnot eeual");
        }
        String first=colours.peek();
        System.out.println("\nretrieve first element: "+first);

        String first1=colours.poll();
        System.out.println("\nretrieve first element and removal: "+first1);

        String[] arr=colours.toArray(new String[0]);
        System.out.println("\narrayconversion");
        for(String e: arr){
            System.out.println(e);
        }
    }
}
