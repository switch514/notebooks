package easy;

import common.TreeNode;

public class Offer28Symmetrc {
    public boolean isSymmetric(TreeNode root) {
        if (null == root) {
            return true;
        }
        return isSymmetricNodes(root.left, root.right);

    }

    private boolean isSymmetricNodes(TreeNode left, TreeNode right) {
        if (null == left && null == right) {
            return true;
        }
        if(null == left || null == right){
            return false;
        }
        if(right.val != left.val){
            return false;
        }
        return isSymmetricNodes(left.left,right.right) && isSymmetricNodes(left.right, right.left);
    }
}
