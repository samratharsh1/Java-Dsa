import java.util.ArrayList;

public class findsubsets {
    public static void main(String[] args) {
        ArrayList<String>ans=new ArrayList<>();
        String str="samrat";
        findSubset(str,"",0);
    }
    static void findSubset(String s,String ans,int i){
        //base case 
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        // recursion 
        //yes
        findSubset(s, ans+s.charAt(i), i+1);
        //no
        findSubset(s, ans, i+1);
    }

    
}
