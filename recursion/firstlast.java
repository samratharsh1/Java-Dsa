public class firstlast {
    public static void main(String[] args) {
    int arr[]={1,2,4,5,4,3,24,35,65,7323,4542};
    int k=65;
    System.out.println(first(arr,k,0));
        
    }

    static int last(int arr[],int key,int i){
        if(i==arr.length){
            return -1;
        }
        if (arr[i]==key){
            return last(arr, key, i+1);
        }
    }


    static int first(int arr[],int key,int i){
        if (i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return first(arr,key,i+1);
    }
    
}
