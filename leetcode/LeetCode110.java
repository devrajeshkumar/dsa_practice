package leetcode;

public class LeetCode110 {
    public int check(TreeNode root) {
        if (root == null)
            return 0;
        int l = check(root.left);
        int r = check(root.right);
        if (Math.abs(l - r) > 1)
            return -1;
        if (l == -1 || r == -1)
            return -1;
        return Math.max(l, r) + 1;

    }

    public boolean isBalanced(TreeNode root) {
        int h = check(root);
        if (h == -1)
            return false;
        return true;
    }
}
