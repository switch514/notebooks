package easy;

import common.TreeNode;

public class Offer27MirrorTree {
    public TreeNode mirrorTree(TreeNode root) {
        if (null == root) {
            return null;
        }
        if (null != root.left || null != root.right) {
            TreeNode node = root.left;
            root.left = root.right;
            root.right = node;
            if (null != root.right) {
                mirrorTree(root.right);
            }
            if (null != root.left) {
                mirrorTree(root.left);
            }
        }
        return root;
    }
}
