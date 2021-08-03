package easy;

import common.TestUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class Offer32PrintBinTreeTest {

    @Test
    public void levelOrder() {
        System.out.println(new Offer32PrintBinTree().levelOrder(TestUtils.getTreeNode(new Integer[]{3,9,20,null,null,15,7})));
    }
}