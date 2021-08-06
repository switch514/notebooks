package easy;

import common.TestUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class Offer55IsBalanceTest {

    @Test
    public void isBalanced() {
        System.out.println(new Offer55IsBalance().isBalanced(TestUtils.getTreeNode(new Integer[]{3,9,20,null,null,15,7})));
        System.out.println(new Offer55IsBalance().isBalanced(TestUtils.getTreeNode(new Integer[]{1,2,2,3,3,null,null,4,4})));
    }
}