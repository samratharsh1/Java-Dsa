import java.util.Arrays;
public class kandanesalgo {
    public static void main(String[] args) {
        int ms=Integer.MIN_VALUE,cs=0;
        int arr[]={-2,-3,-4,-1,-5,-3};
        Arrays.sort(arr);
        if(arr[arr.length-1]<0){
            System.out.println(arr[arr.length-1]);
        }
        else{
        
        for (int i = 1; i < arr.length; i++) {
            cs+=arr[i];
            if (cs<0){
                cs=0;
            }
            ms=Math.max(cs,ms);
                    
            }
            System.out.println(ms);
        }
        


    }
}
