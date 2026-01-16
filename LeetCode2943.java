import java.util.Arrays;

public class LeetCode2943 {
    public int maximizeSquareHoleArea(int n, int m, int[] hBars, int[] vBars) {
        Arrays.sort(hBars);
        Arrays.sort(vBars);
        int i = 0, j = 0, cnt1 = 1, cnt2 = 1;
        int maxH = 1, maxV = 1;
        while (i < hBars.length || j < vBars.length) {
            if (i < hBars.length - 1) {
                if (hBars[i] == hBars[i + 1] - 1) {
                    cnt1++;
                } else {
                    maxH = Math.max(maxH, cnt1);
                    cnt1 = 1;
                }
            }
            if (j < vBars.length - 1) {
                if (vBars[i] == vBars[i + 1] - 1) {
                    cnt2++;
                } else {
                    maxV = Math.max(cnt2, maxV);
                    cnt2 = 1;
                }
            }
            i++;
            j++;
        }
        maxH = Math.max(maxH, cnt1);
        maxV = Math.max(cnt2, maxV);
        int side = Math.min(maxH + 1, maxV + 1);
        return side * side;
    }
}
