package easy;

import common.TestUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class Offer54SearchTreeTest {

    @Test
    public void kthLargest() {
        System.out.println(new Offer54SearchTree().kthLargest(TestUtils.getTreeNode(new Integer[]{5,3,6,2,4,null,null,1}),3));
        System.out.println(new Offer54SearchTree().kthLargest(TestUtils.getTreeNode(new Integer[]{3,1,4,null,2}),4));
    }
}