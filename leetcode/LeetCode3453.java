package leetcode;

public class LeetCode3453 {
    public double areaBelow(double mid, int[][] squares) {
        double area = 0;
        for (int i = 0; i < squares.length; i++) {
            double len = squares[i][2], y = squares[i][1];
            if ((len + y) <= mid) {
                area += (len * len);
            } else if (y < mid && len + y > mid) {
                area += (len * (mid - y));
            }
        }
        return area;
    }

    public double separateSquares(int[][] squares) {
        double total = 0, low = Double.MAX_VALUE, high = Double.MIN_VALUE;
        for (int i = 0; i < squares.length; i++) {
            double y = squares[i][1], len = squares[i][2];
            total += (len * len);
            low = Math.min(low, y);
            high = Math.max(high, y + len);
        }

        double target = total / 2.0;
        double ans = -1;
        while (low < high) {
            if ((high - low) < Math.pow(10, -5))
                break;
            double mid = (low + high) / 2.0;
            double currentArea = areaBelow(mid, squares);
            if (currentArea < target) {
                low = mid;
            } else {
                ans = mid;
                high = mid;
            }
        }
        return ans;
    }
}
