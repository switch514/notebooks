package easy;

import common.TestUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class Offer18DeleteLinkTest {

    @Test
    public void deleteNode() {
        TestUtils.PrintLink(new Offer18DeleteLink().deleteNode(TestUtils.getListLink(new int[]{4,5,1,9}), 4));
        TestUtils.PrintLink(new Offer18DeleteLink().deleteNode(TestUtils.getListLink(new int[]{4,5,1,9}), 1));
    }
}