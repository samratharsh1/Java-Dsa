import java.util.*;

public class stackframe {
    public static void main(String[] args) {
         Stack<Integer> st=new Stack<>();
        st.push(5);
        st.push(7);
        st.push(8);
        st.push(3);
        st.push(4);
         while(!st.isEmpty()){
            System.out.println(st.peek());
            st.pop();
         }
    }
    
}
