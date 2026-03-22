import java.util.*;
public class pushatbottom {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(6);
        st.push(4);
        st.push(10);
        st.push(12);
        pushBottom(st, 0);
        while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
        }
        
    }
    public static void pushBottom(Stack<Integer>a,int data ){
        if(a.isEmpty()){
            a.push(data); 
            return;
        }
        int top=a.pop();
        pushBottom(a, data);
        a.push(top);
    }
}
