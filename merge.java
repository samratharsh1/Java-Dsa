import java.util.ArrayList;

public class merge {
    public static void main(String[] args) {
        int []arr={1,4,6,3,5,3,2,2,2,3,3,0,1,23,4}       
    }
    static void mergesort(int [] arr,int left;int right){
        if(left>=right){return;}
        int mid=(left+right)/2;
        mergesort(int arr[],left,mid);
        mergesort(int arr[],mid+1,right);
        merge(arr[],left,mid,right);

    }
    static void merge(int arr[],int left,int mid,int right){
        ArrayList<Integer>temp=new ArrayList<>();
        int j=mid+1;
        int i=left;
        while(i<=left&&j<=right){
            if(arr[i]<=arr[j]){
                temp.add(arr[i]);
 
            }
            else{temp.add(arr[j]);
                j++;}
        }
        while(i<=mid){
            temp[k]=arr[i];
                i++;
                k++;
        }
        while(j<=right){
            temp[k]=arr[j];
                j++
                k++;
        }
    }

    
}
