import java.util.*;

public class treeset {
    public static void main(String[] args) {
        TreeSet<String>colours=new TreeSet<>();
        colours.add("white");
        colours.add("yellow");
        colours.add("black");
        colours.add("pink");
        Iterator<String>itr=colours.iterator();
        System.out.println("Iteration");
        while(itr.hasNext()){
            System.out.println("names are: "+itr.next());
        }
        TreeSet<String>clone=new TreeSet<String>(colours);
        System.out.println("\ncloneSet: "+clone);

        Iterator<String>itr1=colours.descendingIterator();
        System.out.println("\nReverse Iteration");
        while(itr1.hasNext()){
            System.out.println("names are: "+itr1.next());
        }
        int n=colours.size();
        System.out.println("\nTotal size of the set is: "+n);

        TreeSet<String> set2=new TreeSet<>();
        set2.addAll(colours);
        System.out.println("\nAdd all the elements to another set: "+set2);

        if(set2.equals(colours)){
            System.out.println("\nthey are equal");
        }else{
            System.out.println("\nnot equal");
        }
        String first=colours.first();
        System.out.println("\nthe first element: "+first);
        String last=colours.last();
        System.out.println("\nthe last element: "+last);

        TreeSet<Integer>numbers=new TreeSet<>();
        numbers.add(1);
        numbers.add(10);
        numbers.add(4);
        numbers.add(6);
        numbers.add(8);
        System.out.println("\nNumbers: "+numbers);

        TreeSet<Integer>lessthan7=new TreeSet<>(numbers.headSet(7));
        System.out.println("\nlessthan7: "+lessthan7);

        Integer ceiling = numbers.ceiling(6);
        System.out.println("\nElement >= 6: " + ceiling);

        Integer floor = numbers.floor(6);
        System.out.println("\nElement <= 6: " + floor);

        Integer higher = numbers.higher(6);
        System.out.println("\nElement > 6: " + higher);

        Integer lower = numbers.lower(6);
        System.out.println("\nElement < 6: " + lower);

        colours.remove(colours.first());
        System.out.println("\nremove first element: "+colours);
        colours.remove(colours.last());
        System.out.println("\nremove last element: "+colours);
        colours.remove("black");
        System.out.println("\nremove specific element: "+colours);


    }
}
