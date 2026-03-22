import java.util.*;
public class revstring {
    public static void main(String[] args) {
        String s="samrat";
        Stack<Character> st=new Stack<>();
        for (int i=0;i<s.length();i++) {
            st.push(s.charAt(i));
        }
        StringBuilder ans=new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.peek());
            st.pop();
        }
        System.out.println(ans);

    }
    
}
