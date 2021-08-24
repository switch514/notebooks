package normal;

import common.TestUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class Offer26SubTreeTest {

    @Test
    public void isSubStructure() {
        System.out.println(new Offer26SubTree().isSubStructure(TestUtils.getTreeNode(new Integer[]{4,2,3,4,5,6,7,8,9}),TestUtils.getTreeNode(new Integer[]{4,8,9})));
        System.out.println(new Offer26SubTree().isSubStructure(TestUtils.getTreeNode(new Integer[]{1,2,3}),TestUtils.getTreeNode(new Integer[]{3,1})));
        System.out.println(new Offer26SubTree().isSubStructure(TestUtils.getTreeNode(new Integer[]{3,4,5,1,2}),TestUtils.getTreeNode(new Integer[]{4,1})));
    }
}