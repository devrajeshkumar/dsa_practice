package leetcode;

public class LeetCode1680 {
    public int concatenatedBinary(int n) {
        long result = 0;
        int mod = 1000000000 + 7;
        for (int i = 1; i <= n; i++) {
            int digis = (int) (Math.log(i) / Math.log(2)) + 1;
            result = ((result << digis) + i) % (mod);
        }
        return (int) result;
    }
}
