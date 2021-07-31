package normal;

import common.TreeNode;

public class No236BinaryTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p == root || q == root){
            return root;
        }
        if(null != root){
            TreeNode lSon = lowestCommonAncestor(root.left, p, q);
            TreeNode rSon = lowestCommonAncestor(root.right, p ,q);
            if(null != lSon && null != rSon){
                return root;
            }else if(null == lSon){
                return rSon;
            }else{
                return lSon;
            }
        }
        return null;
    }


}
