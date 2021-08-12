package easy;

import common.TestUtils;
import common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Offer68CommonAncesstorTest {

    @Test
    public void lowestCommonAncestor() {
        TreeNode root = TestUtils.getTreeNode(new Integer[]{6,2,8,0,4,7,9,null,null,3,5});
        System.out.println(new Offer68CommonAncesstor().lowestCommonAncestor(root, root.left, root.right).val);
        System.out.println(new Offer68CommonAncesstor().lowestCommonAncestor(root, root.left, root.left.right).val);
    }

    @Test
    public void lowestCommonAncestor2() {
        TreeNode root = TestUtils.getTreeNode(new Integer[]{3,5,1,6,2,0,8,null,null,7,4});
        System.out.println(new Offer68CommonAncesstor().lowestCommonAncestor2(root, root.left, root.right).val);
        System.out.println(new Offer68CommonAncesstor().lowestCommonAncestor2(root, root.left, root.left.right).val);
    }
}