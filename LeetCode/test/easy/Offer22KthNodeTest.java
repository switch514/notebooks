package easy;

import common.TestUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class Offer22KthNodeTest {

    @Test
    public void getKthFromEnd() {
        TestUtils.PrintLink(new Offer22KthNode().getKthFromEnd2(TestUtils.getListLink(new int [] {1,2,3,4,5}), 2));
    }
}