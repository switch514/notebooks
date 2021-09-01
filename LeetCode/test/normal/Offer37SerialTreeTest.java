package normal;

import common.TestUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class Offer37SerialTreeTest {

    @Test
    public void serialize() {
        String s = new Offer37SerialTree().serialize(TestUtils.getTreeNode(new Integer[]{1,2,3,null,null,4,5}));
        System.out.println(s);
        new Offer37SerialTree().deserialize(s);
    }
}