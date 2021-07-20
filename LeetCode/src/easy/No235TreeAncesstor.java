package easy;

public class No235TreeAncesstor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root.val < p.val && root.val<q.val) {
            if (null != root.right) {
                return lowestCommonAncestor(root.right, p, q);
            }
        } else if (root.val > q.val && root.val > p.val) {
            if (null != root.left) {
                return lowestCommonAncestor(root.left, p, q);
            }
        }
        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
