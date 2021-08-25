package normal;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Offer34PathSum {
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        List<List<Integer>> result = new ArrayList<>();

        updateResult(root, 0, new ArrayList<Integer>(), target, result);

        return result;
    }

    private void updateResult(TreeNode root, int sum, List<Integer> currentNodes, int target, List<List<Integer>> result) {
        if (root == null) {
            return;
        }

        sum = sum + root.val;
        currentNodes.add(root.val);
        if ((sum == target) && (root.left == null) && (root.right == null)) {
            result.add(currentNodes);
            return;
        }

        updateResult(root.left, sum, new ArrayList<>(currentNodes), target, result);
        updateResult(root.right, sum, new ArrayList<>(currentNodes), target, result);
    }


}
