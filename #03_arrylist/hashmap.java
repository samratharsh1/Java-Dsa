import java.util.HashMap;
// import java.util.Set;
public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer,String>map=new HashMap<>();

        map.put(1,"samrat");
        map.put(2,"lucky");
        map.put(3,"prince");

        System.out.println(map);

        String student=map.get(3);
        System.out.println(student);

        String s=map.get(10);
        System.out.println(s);

        System.out.println(map.containsValue("samrat"));

        for(int i:map.keySet()){
            System.out.println(map.get(i));
        }
        
    }
    
}
