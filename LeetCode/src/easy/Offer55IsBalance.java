package easy;

import common.TreeNode;

public class Offer55IsBalance {
    public boolean isBalanced(TreeNode root) {
        if (null == root) {
            return true;
        }
        int leftDepth = getDepth(root.left, 0);
        int rightDepth = getDepth(root.right,0);
        if (Math.abs(rightDepth - leftDepth) > 1) {
            return false;
        } else {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }

    private int getDepth(TreeNode node, int depth) {
        if (null == node) {
            return depth;
        }
        return Math.max(getDepth(node.left, depth + 1), getDepth(node.right, depth + 1));
    }
}
