import java.util.Stack;

public class revstack {
 public static void main(String[] args) {
    Stack<Integer> st=new Stack<>();
    st.push(2);
    st.push(11);
    st.push(3);
    st.push(4);
    print(st);
    st.push(2);
    st.push(11);
    st.push(3);
    st.push(4);
    rev(st);
    System.out.println("+++++++++++");
    print(st);
    

 }
 public static void print(Stack<Integer>a){
    while(!a.isEmpty()){
        System.out.println(a.pop());
    }
 }
 public static void rev(Stack<Integer>a ){
        if(a.isEmpty()){
            return;
        }
        int top=a.pop();
        rev(a);
        pushBottom(a,top);
        // a.push(top);
    }   


 public static void pushBottom(Stack<Integer>a,int data ){
        if(a.isEmpty()){
            a.push(data);
            return;
        }
        int top=a.pop();
        pushBottom(a,data);
        a.push(top);
    }   
}
