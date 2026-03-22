import java.util.*;

public class majoritySubarrays {
    // Simple brute-force solution (O(n^2)) that's easy to read and integrate.
    // For each subarray [i..j] we count occurrences of target and check if it's a majority.
    public static int countSubarrays(int[] nums, int target) {
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int targetCount = 0;
            for (int j = i; j < n; j++) {
                if (nums[j] == target) targetCount++;
                int len = j - i + 1;
                if (targetCount * 2 > len) ans++;
            }
        }
        return ans;
    }

    // quick test with the examples
    public static void main(String[] args) {
        int[] a1 = {1,2,2,3}; int t1 = 2; // expect 5
        int[] a2 = {1,1,1,1}; int t2 = 1; // expect 10
        int[] a3 = {1,2,3}; int t3 = 4;   // expect 0

        System.out.println(countSubarrays(a1, t1));
        System.out.println(countSubarrays(a2, t2));
        System.out.println(countSubarrays(a3, t3));
    }
}
