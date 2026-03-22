public class ssecondlargestsum {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,8};
        int smallest=arr[0];
        int sum=0;


        for (int i = 0; i < arr.length; i++) {
            if (smallest> arr[i]){
                smallest=arr[i];
            }          
        }
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        smallest=sum-smallest;
        System.out.println(smallest);
        // System.out.println(sum);
        if (smallest<sum){
            System.out.println(smallest);
        }
        else{
            System.out.println("-1");
        }

    }
    
}
