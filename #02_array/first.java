import java.util.*;
public class first {
    public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        int x=sc.nextInt();
        set.add(x);
    }
    System.out.println(set);
        
    }
    
}
