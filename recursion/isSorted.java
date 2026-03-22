public class isSorted {
    public static void main(String[] args) {
        int arr[]={1,3,5,6,7,8,8,9,7};
        System.out.println(issorted(arr, 0));
    }

    static boolean issorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if (arr[i]>arr[i+1]){
            return false;
        }
        return issorted(arr, i+1);
    }
}
