package leetcode;

import java.util.Arrays;

public class LeetCode3713 {
    public int longestBalanced(String s) {
        int n = s.length();
        int ans = 0;
        int count[] = new int[26];
        for (int i = 0; i < n; i++) {
            Arrays.fill(count, 0);
            for (int j = i; j < n; j++) {
                int index = s.charAt(j) - 'a';
                count[index]++;
                boolean flag = true;
                for (int x : count) {
                    if (x > 0 && x != count[index]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }
}
