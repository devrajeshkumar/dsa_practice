package leetcode;

import java.util.List;

public class LeetCode3315 {
    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int ans[] = new int[n];
        int i = 0;
        for (int num : nums) {
            if (num == 2) {
                ans[i++] = -1;
            } else {
                int mask = ~(((n + 1) & ~n) >> 1);
                ans[i++] = mask & num;
            }
        }
        return ans;

    }
}
