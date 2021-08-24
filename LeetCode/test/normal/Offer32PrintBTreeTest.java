package normal;

import common.TestUtils;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Offer32PrintBTreeTest {

    @Test
    public void levelOrder() {
        System.out.println(Arrays.toString(new Offer32PrintBTree().levelOrder(TestUtils.getTreeNode(new Integer[]{3,9,20,null,null,15,7}))));
    }

    @Test
    public void levelOrderRes() {
        System.out.println(new Offer32PrintBTree().levelOrderRes(TestUtils.getTreeNode(new Integer[]{1,2,3,4,null,null,5})));
        System.out.println(new Offer32PrintBTree().levelOrderRes(TestUtils.getTreeNode(new Integer[]{3,9,20,null,null,15,7})));

    }
}