package leetcode;

public class LeetCode1689 {
    public int minPartitions(String n) {
        char maxChar = '0';
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) > maxChar) {
                maxChar = n.charAt(i);
            }
        }
        return maxChar - '0';
    }

}
