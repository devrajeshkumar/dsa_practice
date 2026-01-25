package leetcode;

import java.util.Arrays;

public class LeetCode1984 {

    public int minimumDifference(int[] nums, int k) {
        if (k == 1)
            return 0;
        int result = Integer.MAX_VALUE;

        Arrays.sort(nums);

        int last = 0;
        for (int i = k - 1; i < nums.length; i++) {
            result = Math.min(result, nums[i] - nums[last]);
            last++;
        }

        return result;
    }
}