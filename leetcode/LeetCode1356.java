package leetcode;

import java.util.Arrays;

public class LeetCode1356 {
    public int[] sortByBits(int[] arr) {
        Integer[] boxed = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(boxed, (a, b) -> {
            if (Integer.bitCount(a) == Integer.bitCount(b)) {
                return a - b;
            }
            return Integer.bitCount(a) - Integer.bitCount(b);
        });
        return Arrays.stream(boxed).mapToInt(Integer::intValue).toArray();
    }
}
