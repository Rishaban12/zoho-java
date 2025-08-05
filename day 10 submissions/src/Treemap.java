import java.util.Collections;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<Integer,String>map=new TreeMap<>();
        map.put(1,"rishab");
        map.put(2,"jeni");
        map.put(3,"chiran");
        map.put(4,"nothing");
        for(int key: map.keySet()){
            System.out.println(key+": "+map.get(key));
        }
        TreeMap<Integer,String>map2=new TreeMap<>(map);
        System.out.println("\nThe copied treemap is: "+map2);
        if(map.containsKey(2)){
            System.out.println("\nthe key is found and the key's value is: "+map.get(2));
        }else{
            System.out.println("\nnot found");
        }
        if(map.containsValue("rishab")){
            System.out.println("\nthe value is found ");
        }else{
            System.out.println("\nnot found");
        }
        System.out.println("\nreturn all the keys: "+map.keySet());

        map2.clear();
        System.out.println("\nEmpty Treemap: "+map2);

        TreeMap<Integer,String>map1=new TreeMap<>(Collections.reverseOrder());
     map1.put(1,"rishab");
     map1.put(2,"san");
     map1.put(3,"nothing");
        System.out.println("\nreverse order: "+map1);
        Map.Entry<Integer,String>greatest=map.firstEntry();
        System.out.println("\ngreatest key map: "+greatest);
        Map.Entry<Integer,String>lowest=map.lastEntry();
        System.out.println("\nlowest key map: "+lowest);
        int first=map.firstKey();
        System.out.println("\nfirstkey: "+first);

        int last=map.lastKey();
        System.out.println("\nlastkey: "+last);
        NavigableMap<Integer,String>reverse=map.descendingMap();
        System.out.println("\nreverseorder in keys: "+reverse);

    }
}
