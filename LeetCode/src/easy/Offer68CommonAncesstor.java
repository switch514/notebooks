package easy;

import common.TreeNode;

public class Offer68CommonAncesstor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.left == q || p.right == q) {
            return p;
        }
        if (q.left == p || q.right == p) {
            return q;
        }

        if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }

        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        return root;
    }

    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        if(null == root){
            return null;
        }
        if(root==p || root ==q){
            return root;
        }
        TreeNode left = lowestCommonAncestor2(root.left, p,q);
        TreeNode right = lowestCommonAncestor2(root.right, p,q);
        if(left==null){
            return right;
        }
        else if(right == null){
            return left;
        }else{
            return root;
        }

    }
}
