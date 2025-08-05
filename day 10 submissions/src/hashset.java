import java.util.*;

public class hashset {
    public static void main(String[] args) {
        HashSet<String>names=new HashSet<>();
        names.add("rishab");
        names.add("jeni");
        names.add("chiran");
        Iterator<String>itr=names.iterator();
        System.out.println("Iteration");
        while(itr.hasNext()){
            System.out.println("names are: "+itr.next());
        }
        int n=names.size();
        System.out.println("\nTotal size of the set is: "+n);
        if(names.isEmpty()){
            System.out.println("\nthe set is empty");
        }else{
            System.out.println("\nthe set is not empty");
        }
        HashSet<String>clone=new HashSet<String>(names);
            System.out.println("\ncloneSet: "+clone);

        String[] arr = names.toArray(new String[0]);
        System.out.println("\nArray conversion:");
        for (String element : arr) {
            System.out.println(element);
        }
        TreeSet<String> treeset=new TreeSet<>(names);
        System.out.println("\nTreeset conversion: "+treeset);

        ArrayList<String> arraylist=new ArrayList();
        arraylist.addAll(names);
        System.out.println("\narraylist conversion: "+arraylist);

        if(clone.equals(names)){
            System.out.println("\nthey are equal");
        }
        clone.clear();
        System.out.println("\nclone is empty");
    }
}
