public class maxElement {
    public static void main(String[] args) {

        int arr[]={10,5,2,7,1,9};

        int last=arr.length;
        int mx=0;
        int target=15;
        int tv=0;
        for (int i = 0; i < last; i++) {
            for (int j = i; j < last; j++) {
                if(arr[j]<=target){
                    target-=arr[j];
                    tv++;
                    mx=Math.max(tv,mx);
                }   
            }
        }

        System.out.println(mx);


        
    }    
    
}
