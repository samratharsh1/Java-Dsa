import java.util.Stack;

public class maxArea_in_Histogram {

    public static void main(String[] args) {
        int []arr={2,1,5,6,2,3};;
        maxArea(arr);
    }
     
    public static void maxArea(int [] arr){
        int max=0;
        int n=arr.length;
        int []nsr=new int [n];
        int []nsl=new int [n];
        // next smaller right;
        Stack<Integer> s=new Stack<>();
        for (int i = n-1; i>=0; i--) {
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=n;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        s=new Stack<>();
        // next smaller left 
        for (int i = 0; i<n; i++) {
            while(!s.isEmpty()&&arr[s.peek()]>=arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        // area calculation 
        for (int i = 0; i <n; i++) {
            int height=arr[i];
            int width=nsr[i]-nsl[i]-1;
            int area=height*width;
            max=Math.max(area,max);
        }
        System.out.println("Max area >>> "+max);
         System.out.print("NSR >> ");
        for(int i:nsr){
           
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.print("NSL >> ");
                for(int i:nsl){
            System.out.print(i+" ");
        }


    }
}