package normal;

import common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Offer32PrintBTree {
    public int[] levelOrder(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> tmp = new LinkedList<>();
        tmp.add(root);
        printTree(tmp, res);

        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }
        return result;
    }

    private void printTree(Queue<TreeNode> treeNodes, List<Integer> res) {
        if (treeNodes.isEmpty()) {
            return;
        }

        Queue<TreeNode> tmp = new LinkedList<>();
        for (TreeNode node : treeNodes) {
            if (node != null) {
                res.add(node.val);
                if (node.left != null) {
                    tmp.add(node.left);
                }
                if (node.right != null) {
                    tmp.add(node.right);
                }
            }
        }
        treeNodes = tmp;
        printTree(tmp, res);
    }

    public List<List<Integer>> levelOrderRes(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        List<TreeNode> nodes = new ArrayList<>();
        if (null != root) {
            nodes.add(root);
        }
        printTreeWithIndex(0, nodes, res);

        return res;
    }

    private void printTreeWithIndex(int index, List<TreeNode> nodes, List<List<Integer>> res) {
        if (nodes.isEmpty()) {
            return;
        }

        List<Integer> tmpRes = new ArrayList<>();
        List<TreeNode> tmpNodes = new ArrayList<>();
        for (TreeNode node : nodes) {
            if (null != node) {
                tmpRes.add(node.val);
            }
        }


        for (int i = nodes.size() - 1; i >= 0; i--) {
            TreeNode node = nodes.get(i);
            if (index % 2 == 0) {
                if (null != node.right) {
                    tmpNodes.add(node.right);
                }
                if (null != node.left) {
                    tmpNodes.add(node.left);
                }
            } else {
                if (null != node.left) {
                    tmpNodes.add(node.left);
                }
                if (null != node.right) {
                    tmpNodes.add(node.right);
                }
            }
        }
        res.add(tmpRes);
        printTreeWithIndex(index + 1, tmpNodes, res);
    }
}
