import java.util.LinkedList;
import java.util.Queue;

public class stream_letters {

    public static void printNonRepeating(String s) {
        int []freq =new int [26];
        Queue<Character>q=new LinkedList<>();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            q.add(c);
            freq[c-'a']++;
            while(!q.isEmpty() && freq[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                ans.append("#");
            }else{
               ans.append(q.peek());
            }
        }
        System.out.println(ans.charAt(ans.length()-1));
    }
    public static void main(String[] args) {
        String s="aaaaaaaaa"; 
        printNonRepeating(s);
    }   
    
}
