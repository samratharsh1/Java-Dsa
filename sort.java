public class sort {
    public static void main(String[] args) {
        int arr[]={1,4,3,5,6,1};
        int last=arr.length;
        int temp=0;
        for (int i=0;i<last;i++){
            for(int j=1;j<last;j++){
                if(arr[j-1]>arr[j]){
                    temp=arr[j-1];
                    arr[j]=arr[j-1];
                    arr[j]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            
        }
    }
    
}
