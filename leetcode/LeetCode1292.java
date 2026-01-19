package leetcode;

public class LeetCode1292 {
    public int maxSideLength(int[][] mat, int threshold) {
        int row = mat.length, col = mat[0].length;

        int[][] prefixSum = new int[row + 1][col + 1];
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                prefixSum[i][j] = prefixSum[i - 1][j] + prefixSum[i][j - 1] - prefixSum[i - 1][j - 1]
                        + mat[i - 1][j - 1];
            }
        }
        int maxSize = Math.min(row, col);
        for (int size = maxSize; size >= 1; size--) {
            for (int i = 1; i + size <= row + 1; i++) {
                for (int j = 1; j + size <= col + 1; j++) {
                    int currSum = prefixSum[i + size - 1][j + size - 1] - prefixSum[i - 1][j + size - 1]
                            - prefixSum[i + size - 1][j - 1] + prefixSum[i - 1][j - 1];
                    if (currSum <= threshold) {
                        return size;
                    }

                }
            }
        }
        return 0;
    }
}
