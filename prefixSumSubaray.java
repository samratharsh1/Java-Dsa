public class prefixSumSubaray{
    public static void main(String[] args){
        int arr[] = {1,5,6,4,3,6,7,5,3};
        int sumarr[] = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int currsum = 0;
            for (int j = i; j < arr.length; j++) {
                currsum += arr[j];
            }
            sumarr[i] = currsum;
        }

        for (int s : sumarr) {
            System.out.println(s);
        }
    }
}


