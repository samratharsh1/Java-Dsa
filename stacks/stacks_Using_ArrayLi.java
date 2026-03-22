import java.util.ArrayList;
// import java.util.Stack;
import java.util.Stack;

public class stackkss {
    static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();

        // isEmpty
        public static boolean isEmpty(){
            return list.size()==0;
        }

        // push
        public static void push( int data){
            list.add(data);
        }

        // pop
        public static int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1; // or throw exception
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }
        // peek
        public static int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return -1; // or throw exception
            }
            return list.get(list.size()-1);
        }

    }
    
    

    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(2);
        s.push(1);
        s.push(0);
        s.push(10);
        
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        
        
         
    }


    
}
