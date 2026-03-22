public class find_N_Unique_integersumup {
    public static void main(String[] args) {

        // int n=7;
        // int arr[]=new int[n];

        // if (n%2!=0){
        //     arr[n/2]=0;
        // }
        // for (int i = 0; i < arr.length/2; i++) {
        //     if(i%2==0){
        //         arr[i]=i+3;
        //         arr[(n/2)+i]=-(i+3);
        //     }
        //     else{
        //         arr[i]=i;
        //         arr[(n/2)+i]=-i;
        //     }
            
        // }

        // for (int i = 0; i < aarr.length; i++) {

        //     System.out.print(arr[i]+" ");
            
        // }



        int arr[]={1,2,3,4,5,6,7};
        int curr=0;
        int max=0;
        for (int i=0;i<arr.length-1 ;i++){
            curr+=arr[i+1]-arr[i];
            if (curr<=0){curr=0;}
            max=Math.max(curr,max);
        }
        System.out.println(max);        
    }

    
}
