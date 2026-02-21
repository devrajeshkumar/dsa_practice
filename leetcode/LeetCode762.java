package leetcode;

public class LeetCode762 {
    public int countBits(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) > 0)
                count++;
            n = n >> 1;
        }
        return count;
    }

    public boolean isPrime(int n) {
        if (n < 2)
            return false;
        if (n == 2)
            return true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public int countPrimeSetBits(int left, int right) {
        int result = 0;
        for (int i = left; i <= right; i++) {
            int count = countBits(i);
            if (isPrime(count)) {
                result++;
            }
        }
        return result;
    }
}
