import java.util.*;

public class ceasercipher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Sring s="";
        int k=
        int temp=0;
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if((c-'a')>=0&&(c-'a')<=26){
                temp=26+(temp-26+k)%26;
                ans.append(char('a'+temp));
            } 
                
            if((c-'A')>=0 && (c-'A')<=26){
                temp=26+(temp-26+k)%26;
                ans.append(char('A'+temp));
            }
        }
        System.out.println(ans.toString());
    }
    
}