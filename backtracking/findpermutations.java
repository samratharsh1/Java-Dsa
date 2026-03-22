public class findpermutations {

    public static void main(String[] args) {
        findPermutation("prince", "");

        

    }
    static void findPermutation(String s,String ans){
        if(s.length()==0){
            System.out.print(ans+" ");
            return;
        }

        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            String news=s.substring(0,i)+s.substring(i+1);
            findPermutation(news, ans+curr);
        }
    }

    
}
