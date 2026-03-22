public class binsearch {
    
    public static int binsear(int arr[],int key) {
        int start=0;
        int end=arr.length-1;
        
        while(start<=end){
            int mid=(start+end)/2;
            if (key==arr[mid]){
                return mid;
            }

            if (key<arr[mid]){
                end=mid-1;
            }

            else{
                start=mid+1;
            }
        }
        return -1;

    }

public static void main(String[] args) {
    int no[]={2,3,4,5,6,7,8,8,9,10};
    int key=8;
    System.out.println(binsear(no, key));
}




}
