import java.util.Stack;

public class validparenthesis {
    public static void main(String[] args) {
        String s = "({[]{}}()){";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char t = s.charAt(i);
            if (t == '(' || t == '{' || t == '[') {
                st.push(t);
            } else {
                if (st.isEmpty()) return false;
                if ((st.peek() == '(' && t == ')') ||
                    (st.peek() == '{' && t == '}') ||
                    (st.peek() == '[' && t == ']')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
