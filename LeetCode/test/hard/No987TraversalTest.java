package hard;

import common.TestUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class No987TraversalTest {

    @Test
    public void verticalTraversal() {
        System.out.println(new No987Traversal().verticalTraversal(TestUtils.getTreeNode(new Integer[]{3,9,20,null,null,15,7})));
        System.out.println(new No987Traversal().verticalTraversal(TestUtils.getTreeNode(new Integer[]{1,2,3,4,5,6,7})));
        System.out.println(new No987Traversal().verticalTraversal(TestUtils.getTreeNode(new Integer[]{1,2,3,4,6,5,7})));
    }
}