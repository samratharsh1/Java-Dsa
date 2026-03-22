import java.util.Stack;

public class duplicateparenthesis {
    public static void main(String[] args) {
        String s="((a))";
        System.out.println((isDuplicate(s)) ? "duplicate found" : "duplicate not found");
    }
    static boolean isDuplicate(String s){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (st.isEmpty()) return false;
                int count = 0;
                while (!st.isEmpty() && st.peek() != '(' && st.peek() != '{' && st.peek() != '[') {
                    count++;
                    st.pop();
                }
                if (!st.isEmpty()) {
                    st.pop();
                }
                if (count == 0) return true;
            } else {
                st.push(ch);
            }
        }
        return false;
    }
    
}
