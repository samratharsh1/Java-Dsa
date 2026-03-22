import java.util.Arrays;
public class lll {
    public static void main(String[] args) {
        int zeros=5;
        int ones=3;
        int ans=0;
        
        String [] arr={"10","0001","111001","1","0"};
        // Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j].length()>arr[j+1].length()){
                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(String s:arr){
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='0'||s.charAt(i)=='1'&&zeros>0&&ones>0){
                    if(s.charAt(i)=='1'){ones--;}    
                    if(s.charAt(i)=='0'){zeros--;}
                    ans++;
                }
            }
        }

        System.out.println(ans);
        
        
    }
    
}
