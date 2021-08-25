package normal;

import common.TestUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class Offer34PathSumTest {

    @Test
    public void pathSum() {
        System.out.println(new Offer34PathSum().pathSum(TestUtils.getTreeNode(new Integer[]{-2,null,-3}),-5));
        System.out.println(new Offer34PathSum().pathSum(TestUtils.getTreeNode(new Integer[]{5,4,8,11,null,13,4,7,2,null,null,5,1}),22));
    }
}