public class bubblesort {
    public static void main(String[] args) {
        int arr[]={2,4,6,1,8,7};
        sort(arr);

        }

    public static void sort(int arr[]){
        int temp=0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
                               
                
            }
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            
        }

    }
    
}
