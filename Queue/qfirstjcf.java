import java.util.*;

public class qfirstjcf {
    public static void main(String[] args) {
        // Queue<Integer> q=new LinkedList<>(); //arraydeque
        Queue<Integer>q=new ArrayDeque<>();
        q.add(50);
        q.add(90);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}
