package easy;

import common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Offer32PrintBinTree {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        printTree(root,result,0);

        return result;
    }

    private void printTree(TreeNode root, List<List<Integer>> result, int level) {
        if(null == root){
            return ;
        }
        if(result.size()>level){
            List<Integer> levelList =result.get(level);
            levelList.add(root.val);
            result.set(level, levelList);
        }else{
            List<Integer> levelList = new ArrayList<>();
            levelList.add(root.val);
            result.add(level, levelList);
        }

        if(null != root.left){
            printTree(root.left, result, level+1);
        }
        if(null != root.right){
            printTree(root.right, result, level+1);
        }
    }
}
