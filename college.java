public class college {
    public static void main(String[] args) {
        int n=3;
        int []arr={1,2,3};
        int start=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            int prod=1;
            int sum=0;
            for(int j=0;j<n;j++){
                sum+=arr[j];
                prod*=arr[j];
                if(j+1-start==i){
                    if(sum==prod)count++;
                    sum-=arr[start];
                    prod/=arr[start];
                    start++;
                }
            }
        }
        System.out.println(count);

        // Scanner sc=new Scanner(System.in);
        // int x=sc.nextInt();

    int ount = 0;

    for (int i = 0; i < n; i++) {
    long product = 1; // Use long to prevent overflow
    long sum = 0;
    
    for (int j = i; j < n; j++) {
        product *= arr[j];
        sum += arr[j];
        
        if (product == sum) {
            ount++;
        }
        
        // Optimization: if product is already much larger than 
        // the max possible sum (n * max_element), you can break early.
        if (product > n * 1000) break; // Adjust based on max element
    }
}
System.out.println(ount);


    }
    
}
