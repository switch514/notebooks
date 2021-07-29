package easy;

import common.TestUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class Offer28SymmetrcTest {

    @Test
    public void isSymmetric() {
        System.out.println(new Offer28Symmetrc().isSymmetric(TestUtils.getTreeNode(new Integer[]{1,2,2,3,4,4,3})));
        System.out.println(new Offer28Symmetrc().isSymmetric(TestUtils.getTreeNode(new Integer[]{1,2,2,null,3,null,3})));
    }
}