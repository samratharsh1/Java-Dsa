public class reverse {
    public static int[] reverse(int arr[]){
        int last = arr.length - 1;
        for (int i = 0; i < (arr.length)/2; i++) {
            int temp = arr[i];
            arr[i] = arr[last-i];
            arr[last-i] = temp;
        }
        return arr;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,6};
        reverse(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
}
