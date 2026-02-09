package leetcode;

import java.util.ArrayList;

public class LeetCode1382 {
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> inorder = new ArrayList<>();
        inorderTraversal(root, inorder);
        return createBST(0, inorder.size(), inorder);
    }

    public void inorderTraversal(TreeNode root, ArrayList<Integer> inorder) {
        if (root == null)
            return;
        inorderTraversal(root.left, inorder);
        inorder.add(root.val);
        inorderTraversal(root.right, inorder);
    }

    public TreeNode createBST(int start, int end, ArrayList<Integer> inorder) {
        if (start > end)
            return null;
        int mid = start + (end - start) / 2;
        TreeNode leftSubtree = createBST(start, mid - 1, inorder);
        TreeNode rightSubtree = createBST(mid + 1, end, inorder);
        TreeNode node = new TreeNode(inorder.get(mid), leftSubtree, rightSubtree);
        return node;
    }
}
