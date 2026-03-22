import java.util.*;

public class firstt {
    public static void main(String[] args) {
        Set<Integer> s1 = new HashSet<>(Arrays.asList(1, 12, 34, 4));
        Set<Integer> s2 = new HashSet<>(Arrays.asList(2, 3, 4));
        System.out.println(s1.containsAll(s2));
        System.out.println(s1);
    }

}
