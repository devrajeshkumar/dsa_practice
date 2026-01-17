public class LeetCode3047 {
    public long largestSquareArea(int[][] bottomLeft, int[][] topRight) {
        long maxArea = 0;
        for (int i = 0; i < bottomLeft.length; i++) {
            for (int j = i + 1; j < bottomLeft.length; j++) {
                int left = Math.max(bottomLeft[i][0], bottomLeft[j][0]);
                int right = Math.min(topRight[i][0], topRight[j][0]);
                int top = Math.min(topRight[i][1], topRight[j][1]);
                int bottom = Math.max(bottomLeft[i][1], bottomLeft[j][1]);
                if (top > bottom && left < right) {
                    int height = top - bottom;
                    int width = right - left;
                    long side = Math.min(height, width);
                    maxArea = Math.max(maxArea, side * side);
                }
            }
        }
        return maxArea;
    }
}
