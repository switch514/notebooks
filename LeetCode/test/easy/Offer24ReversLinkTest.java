package easy;

import common.TestUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class Offer24ReversLinkTest {

    @Test
    public void reverseList() {
        TestUtils.PrintLink(new Offer24ReversLink().reverseList2(TestUtils.getListLink(new int[]{1,2,3,4,5})));
    }
}