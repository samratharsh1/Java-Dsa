import java.util.*;
public class hashset1 {
    public static void main(String[] args) {
        HashSet<Integer>set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        System.out.println(!set.contains(7));
        set.remove(1);
        System.out.println(!set.contains(1));
        System.out.println(set.size());
        // for (int i:set) {
        //     System.out.println(i);
        // }
        Iterator it=set.iterator();
        while(it.hasNext()){
        System.out.println(it.next());}
        // System.out.println(it.hasNext());


    }
    
}
