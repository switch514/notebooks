package easy;

import common.TestUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class Offer27MirrorTreeTest {

    @Test
    public void mirrorTree() {
        new Offer27MirrorTree().mirrorTree(TestUtils.getTreeNode(new Integer []{4,2,7,1,3,6,9}));
    }
}