import java.util.*;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq=new LinkedList<>();
        dq.addFirst(1);
        dq.addLast(199);
        dq.addLast(89);
        System.out.println(dq);
        dq.removeFirst();
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
    }
}
