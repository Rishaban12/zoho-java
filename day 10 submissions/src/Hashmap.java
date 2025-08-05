import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "red");
        map.put(2, "blue");
        map.put(3, "white");
        map.put(4, "yellow");
        for (int key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
        System.out.println("\nTotal size of map: " + map.size());

        HashMap<Integer, String> map2 = new HashMap<>(map);
        System.out.println("\nThe copied hashmap is: " + map2);

        String remove = map2.remove("white");
        System.out.println("\nThe removed value and the except key value pairs is : " + map2);

        map2.clear();
        System.out.println("\nEmpty Treemap: " + map2);

        if (map2.isEmpty()) {
            System.out.println("\nIt is Empty");
        }else{
        System.out.println("\nnot empty");
        }

        Set<HashMap.Entry<Integer,String>>entries=map.entrySet();
        System.out.println("\nthe set view of mappings");
        for(HashMap.Entry<Integer,String> entry: entries){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }

        HashMap<Integer,String>copy=new HashMap<>(map);
        System.out.println("\nOriginal: "+map);
        System.out.println("The copied treemap is: "+copy);

        if(map.containsKey(2)){
            System.out.println("\nthe key is found and the key's value is: "+map.get(2));
        }else{
            System.out.println("\nnot found");
        }
        if(map.containsValue("yellow")){
            System.out.println("\nthe key is found and value of the key ");
        }else{
            System.out.println("\nnot found");
        }
        System.out.println("\nGet the value for the specified key: "+map.get(4));
    }
}
