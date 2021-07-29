package normal;

import common.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class No863Knode {
    private HashMap<Integer, TreeNode> parentMap = new HashMap<>();
    private List<Integer> result = new ArrayList<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        updateParent(root);
        findResult(target, null, 0, k);
        return result;
    }

    private void findResult(TreeNode target,TreeNode from, int depth, int k) {
        if(null == target){
            return;
        }
        if(depth == k){
            result.add(target.val);
        }
        depth++;
        if(from != target.left) {

            findResult(target.left, target, depth, k);
        }

        if(from != target.right) {
            findResult(target.right, target, depth, k);
        }

        if(from != parentMap.get(target.val)) {
            findResult(parentMap.get(target.val), target, depth, k);
        }

    }

    private void updateParent(TreeNode root) {
        if (null != root.left) {
            parentMap.put(root.left.val, root);
            updateParent(root.left);
        }
        if (null != root.right) {
            parentMap.put(root.right.val, root);
            updateParent(root.right);
        }
    }
}
