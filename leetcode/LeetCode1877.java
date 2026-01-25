package leetcode;

import java.util.Arrays;

public class LeetCode1877 {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1;
        int result = Integer.MIN_VALUE;
        while (i < j) {
            result = Math.max(nums[i] + nums[j], result);
            i++;
            j--;
        }
        return result;
    }
}
