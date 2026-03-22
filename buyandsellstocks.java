public class buyandsellstocks {
    public static void main(String[] args) {
        int arr[]={2,4,1};
        int temp=arr[0];
        int diff=0;
        int max=Integer.MIN_VALUE ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<temp){
                temp=arr[i];
            }
            else{
                diff=arr[i]-temp;
                max=Math.max(diff,max);
            }
            System.out.println(max);
               
                
        }
            
    }
        
}
    

