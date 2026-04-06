import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class cluster_locations {
    public static void main(String[] args) {
        //test case  
        // 1,1,0,0,0,0,1,1
        int []arr={1,0,0,0,0,1,1,1};
        int one=0;
        for (int i:arr) {
            one+=i;
        }
        int [][]location= new int [arr.length-one][2];
        int start=0;
        int sum=0;
        int index = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(i-sum+1==one){
                location[index][0] = start;
                location[index][1] = i-1;
                index++;
                sum-=arr[start];
                start++;
            }
        }
        
        List<Integer>ans=new ArrayList<>();
        Arrays.sort(location, Comparator.comparing(o -> o[0]));
        for (int i = 1; i < location.length; i++) {
            if(location[i-1][0]==location[i][0]) {
            ans.add(location[0][0]);
            ans.add(location[0][1]);
            break;
            }
            else{
                ans.add(location[0][0]);
                break;
            }

        }
        
        for (int i:ans) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
}
