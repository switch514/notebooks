package easy;

import common.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class Offer54SearchTree {
    private int result =0;
    private int count =0;

    public int kthLargest(TreeNode root, int k) {

        dfs(root, k);
        return result;
    }

    private void dfs(TreeNode root, int k) {
        if(null == root){
            return;
        }
        dfs(root.right, k);
        count++;
        if(count == k){
            result = root.val;
            return;
        }
        dfs(root.left, k);
    }

}
