package leetcode;

public class LeetCode868 {

    public int binaryGap(int n) {
        int first = -1, second = -1;
        int ans = 0;
        int index = 0;
        while (n > 0) {
            index++;
            if ((n & 1) > 0) {
                if (first == -1) {
                    first = index;
                } else {
                    second = first;
                    first = index;
                }

            }
            if (first != -1 && second != -1) {
                ans = Math.max(ans, first - second);
            }
            n = n >> 1;
        }
        return ans;
    }
}