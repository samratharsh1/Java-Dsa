import java.util.*;
public class hashmap01 {
    public static void main(String[] args) {
        HashMap<Integer,Integer>map=new HashMap<>();
        // map.put("india",120);
        // map.put("china",200);
        // map.put("usa",100);
        // map.put("china",180);

        // System.out.println(map);

        // System.out.println(map.containsKey("china"));
        // System.out.println(map.get("china"));
        int []arr={1,2,3,32,1,1,2,3,3,0,2,2,3,2,343,5,4,5,65,0,5};
        for (int i:arr){
            map.put(i,map.getOrDefault(i, 0)+1);
        }
        System.out.println(map);
        int []ar={1,2,3,32,1,1,2,3,3,0,2,2,3,2,343,5,4,5,65,0,5};
        for (int i:ar){
            map.put(i,map.getOrDefault(i, 0)-1);
        }
        System.out.println(map);
         System.out.println(containsAllZeroValues(map));
    }
    // Checks if all values in the map are zero
    public static boolean containsAllZeroValues(HashMap<Integer, Integer> map) {
        for (int value : map.values()) {
            if (value != 0) {
                return false;
            }
        }
        return true;
    }
}
