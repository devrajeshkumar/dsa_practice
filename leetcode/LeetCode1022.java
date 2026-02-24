package leetcode;

public class LeetCode1022 {
    private int dfs(TreeNode node, int curr) {
        if (node == null)
            return 0;

        curr = (curr << 1) | node.val;

        if (node.left == null && node.right == null) {
            return curr;
        }

        return dfs(node.left, curr) + dfs(node.right, curr);
    }

    public int sumRootToLeaf(TreeNode root) {
        return dfs(root, 0);
    }
}
