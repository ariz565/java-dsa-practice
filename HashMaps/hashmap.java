import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class hashmap {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        //insert
        map.put("USA",200);
        map.put("India", 100);
        map.put("UK", 150);
        map.put("China", 50);
        map.put("xyz", 10); 

        System.out.println(map);

        //search
        if (map.containsKey("India")) {
            System.out.println("Found");
        }

        //delete
        // map.remove("xyz");
        // System.out.println(map);

        //iterate
        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

        // Set<String> keys = map.keySet();
        // for (String key: keys){
        //     System.out.println(key + " " + map.get(key));
        // }

        // for (int x : map.values()) {
        //     System.out.println(x);
        // }
        // for(Map.Entry<String,Integer> e: map.entrySet()){
        //     System.out.println(e.getKey() + " " + e.getValue());
        // }
    }
    
}
