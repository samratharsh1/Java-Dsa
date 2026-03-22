public class maxSumXoe {
    public static void main(String[] args) {
        int[] arr = {1, 6, 3};
        int k =8;
        int maxSum = Integer.MIN_VALUE;
        int ans = 0;
        
        for (int i = 2; i <= k; i+=2) {
            int sum = 0; 
            for (int j = 0; j < arr.length; j++) {
                sum += i ^ arr[j];
            }
            System.out.println(i +"  >>>  "+sum);
            // if (sum > maxSum) {
            //     ans = i;
            //     maxSum = sum;
            // }
        }
        // System.out.println(ans +"  >>>  "+maxSum);
    }

    
}
