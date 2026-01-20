package leetcode;

import java.util.List;

public class LeetCode3314 {

    public int[] minBitwiseArray(List<Integer> nums) {
        int n = nums.size();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= 1000; j++) {
                if ((j | (j + 1)) == nums.get(i)) {
                    arr[i] = j;
                    break;
                }
            }
            if (arr[i] == 0) {
                arr[i] = -1;
            }
        }
        return arr;
    }
}