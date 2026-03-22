public class removeDuplicates {


    public static void removeDup(String str,int idx,StringBuilder ans,boolean []map){
        if (idx==str.length()){
            System.out.println(ans);
            return;
        }

        char curr=str.charAt(idx);
        if(map[curr-'a']==true ){
            removeDup(str,idx+1,ans,map);
        }
        else{
            map[curr-'a']=true;
            removeDup(str,idx+1,ans.append(curr),map);
        }
    }

    public static void main(String[] args) {

        String str="apnacollege";
        removeDup(str,0,new StringBuilder(""),new boolean[26]);
    }
}