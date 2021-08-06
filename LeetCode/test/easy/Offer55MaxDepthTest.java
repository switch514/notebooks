package easy;

import common.TestUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class Offer55MaxDepthTest {

    @Test
    public void maxDepth() {
        System.out.println(new Offer55MaxDepth().maxDepth2(TestUtils.getTreeNode(new Integer[]{3,9,20,null,null,15,7})));
    }
}