package normal;

import common.TreeNode;

import java.util.HashMap;

public class Offer07RebuildTree {

    private HashMap<Integer, Integer> inorderMap = new HashMap<>();

    /**
     * @param preorder 先序  根左右
     * @param inorder  中序  左根右
     * @return
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (null == preorder || null == inorder) {
            return null;
        }
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return buildTreeWithData(preorder, inorder, 0, 0, inorder.length - 1);
    }

    private TreeNode buildTreeWithData(int[] preorder, int[] inorder, int iP, int iL, int iR) {
        if(iL>iR || iP> inorder.length){
            return null;
        }
        TreeNode root = new TreeNode(preorder[iP]);
        int iRoot = inorderMap.get(preorder[iP]);
        int leftLength = iRoot - iL;
        root.left = buildTreeWithData(preorder, inorder, iP+1, iL, iRoot - 1);
        root.right = buildTreeWithData(preorder, inorder, iP + leftLength + 1, iRoot +1, iR);

        return root;
    }
}
