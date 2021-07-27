package easy;

import common.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class No671SecondMinNode {
    int secondMin = -1;
    public int findSecondMinimumValue(TreeNode root) {
        findMin(root, root.val);
        return secondMin;
    }

    public void findMin(TreeNode root, int val){
        if(root.val > val){
            if(secondMin == -1) {
                secondMin = root.val;
            }else{
                secondMin = Math.min(root.val, secondMin);
            }
            return;
        }
        if(null != root.left) {
            findMin(root.left,val) ;
            findMin(root.right,val);
        }
    }
}
