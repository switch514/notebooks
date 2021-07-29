package normal;

import common.TestUtils;
import common.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class No863KnodeTest {

    @Test
    public void distanceK() {
        TreeNode root = TestUtils.getTreeNode(new Integer[]{3,5,1,6,2,0,8,null,null,7,4});
        new No863Knode().distanceK(root, root.left,2);
    }
}