package leetcode;

public class LeetCode3379 {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int result[] = new int[n];
        for (int i = 0; i < n; i++) {
            int index = 0;
            if (nums[i] > 0) {
                index = (nums[i] + i) % n;
            } else {
                index = (i - Math.abs(nums[i]) % n + n) % n;
            }

            result[i] = nums[index];
        }
        return result;
    }
}
