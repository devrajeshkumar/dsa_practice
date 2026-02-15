package leetcode;

import java.util.HashSet;

public class LeetCode3719 {

    public int longestBalanced(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            HashSet<Integer> set = new HashSet<>();
            int even = 0, odd = 0;
            for (int j = i; j < n; j++) {
                if (nums[j] % 2 == 0 && !set.contains(nums[j])) {
                    even++;
                } else if (nums[j] % 2 == 1 && !set.contains(nums[j])) {
                    odd++;
                }
                set.add(nums[j]);
                if (even == odd) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }
}
