package normal;

import common.TreeNode;

public class Offer26SubTree {
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null && B == null) {
            return true;
        }

        if (B == null || A == null) {
            return false;
        }

        if (A.val == B.val) {
            if (isInclude(A.left, B.left) && isInclude(A.right, B.right)) {
                return true;
            }
        }

        return isSubStructure(A.left, B) || isSubStructure(A.right, B);
    }

    private boolean isInclude(TreeNode A, TreeNode B) {
        if (B == null) {
            return true;
        }
        if (A == null) {
            return false;
        }
        if (A.val == B.val) {
            return isInclude(A.left, B.left) && isInclude(A.right, B.right);
        }
        return false;
    }

}
