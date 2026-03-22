import java.util.LinkedList;

public class lk {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        // LinkedList<Integer>llist=new LinkedList<>();
        Node n1=new Node(10);
        Node n1=new Node(20);
        Node n1=new Node(30);

        Node curr=head;
        while(curr!=null){
            System.err.println(curr.data);
            curr=curr.next;
        }

    }

    
}
