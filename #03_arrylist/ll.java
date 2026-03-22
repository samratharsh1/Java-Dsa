import java.util.Arrays;

public class ll {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1};
        int target=2;
        int res=0;
        int n = nums.length;
        int ans=0;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int count=0;
                for (int k = i; k <= j; k++) {
                    if(nums[k]==target){count++;}
                }
                if((j-i+1)/2<=count){
                    ans++;
                }
            
            }
        }
        System.out.println(ans);
    }
}
