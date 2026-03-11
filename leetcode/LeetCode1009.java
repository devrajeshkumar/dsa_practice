package leetcode;

public class LeetCode1009 {
    public int bitwiseComplement(int n) {
        if (n == 0)
            return 1;
        int i = 0;
        int num = 0;
        while (n > 0) {
            if ((n & 1) == 0) {
                num += (1 << i);
            }
            n = n >> 1;
            i++;
        }
        return num;
    }
}
