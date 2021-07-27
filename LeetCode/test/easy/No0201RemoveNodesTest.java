package easy;

import common.TestUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class No0201RemoveNodesTest {

    @Test
    public void removeDuplicateNodes() {
        new No0201RemoveNodes().removeDuplicateNodes(TestUtils.getListLink(new int[ ]{1,2,3,3,2,1}));
    }
}