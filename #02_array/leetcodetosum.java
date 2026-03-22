public class leetcodetosum {
    public static int[] twoSum(int[] nums, int target) {
        int arr1[]={0,0};
        for (int i = 0; i < nums.length; i++) {
            int find = Math.abs(nums[i] - target);
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] == find) {
                    arr1[0]=nums[i];
                    arr1[1]=nums[j];
                }
            }
        }
        return arr1;
    }


    public static void main(String[] args) {
        int arr[]={3,2,4};
        int target=6;
    for (int i = 0; i < 2; i++) {
        
    }twoSum(arr, target);

        
    }
}
