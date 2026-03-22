import java.util.LinkedList;
import org.w3c.dom.Node;
public class mregesortonll {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static class LinkedList {
        Node head;   
        public void add(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
            } else {
                Node temp = head;
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.next = newNode;
            }
        }
        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(100);
        ll.add(2);
        ll.add(1);
        ll.add(30);
        ll.add(24);
        ll.add(99);
        ll.add(-2);
        // Display list
        System.out.println("Original  Linked list");
        ll.print();
        System.out.println("-------------------------------------");
        System.out.println("sorted ascending order Linked list");
        ll.head=mergeSortasc(ll.head);
        ll.print();
        System.out.println("-------------------------------------");
        System.out.println("sorted descending order Linked list");
        ll.head=mergeSortdesc(ll.head);
        ll.print();
        System.out.println("-------------------------------------");
    }
    public static Node getMid(Node head){
        Node slow=head;
        Node fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public  static Node mergeasc(Node head1,Node head2){
        Node mergedll=new Node(0);
        Node temp=mergedll;
        while(head1!=null&&head2!=null){
            if(head1.data <=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }   
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergedll.next;
    }
    public static Node mergeSortasc(Node head){
        if(head==null || head.next==null){
            return head; 
        }
        Node mid=getMid(head);
        Node rightHead=mid.next;
        mid.next=null;
        Node newleft= mergeSortasc(head);
        Node newright= mergeSortasc(rightHead);
        // merge
        return mergeasc(newleft,newright);
    }
    public static Node mergeSortdesc(Node head){
        if(head==null || head.next==null){
            return head; 
        }
        Node mid=getMid(head);
        Node rightHead=mid.next;
        mid.next=null;
        Node newleft= mergeSortdesc(head);
        Node newright= mergeSortdesc(rightHead);
        // merge
        return mergedesc(newleft,newright);
    }
    public  static Node mergedesc(Node head1,Node head2){
        Node mergedll=new Node(0);
        Node temp=mergedll;
        while(head1!=null&&head2!=null){
            if(head1.data >=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergedll.next;
    }
}