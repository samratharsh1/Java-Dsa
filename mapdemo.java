import java.util.HashMap;
import java.util.Set;

public class mapdemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(101, "samrat");
        map.put(102, "lucky");
        map.put(103, "summit");

        System.out.println(map);
        System.out.println(map.get(101));
        System.out.println(map.containsKey(103));
        System.out.println(map.containsValue("samrat"));
        // Set<Integer> integers=map.keySet();
        for(int i:map.keySet()){
            System.out.println(i);
        }
    }
    
}
