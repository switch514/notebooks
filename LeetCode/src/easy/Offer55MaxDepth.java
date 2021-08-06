package easy;

import common.TreeNode;

import java.util.*;

public class Offer55MaxDepth {
    int maxDepth = 0;
    public int maxDepth(TreeNode root) {
        updateMaxDepth(root,0);
        return maxDepth;
    }

    private void updateMaxDepth(TreeNode root, int depth) {
        if(root == null){
            return;
        }
        maxDepth = Math.max(depth+1, maxDepth);
        updateMaxDepth(root.left, depth + 1);
        updateMaxDepth(root.right, depth + 1);
    }

    public int maxDepth2(TreeNode root){
        return bfs(root);
    }

    private int bfs(TreeNode root) {
        if(null == root){
            return 0;
        }
        LinkedList<TreeNode> levelQueue = new LinkedList<TreeNode>();
        levelQueue.add(root);
        int level =0;
        while(!levelQueue.isEmpty()){
            LinkedList<TreeNode> tmp = new LinkedList<>();
            for(TreeNode node: levelQueue){
                if(null != node.left){
                    tmp.add(node.left);
                }
                if(null != node.right){
                    tmp.add(node.right);
                }
            }
            levelQueue = tmp;
            level++;
        }
        return level;
    }
}
