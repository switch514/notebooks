package easy;

import common.TestUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class Offer25MergeLinkTest {

    @Test
    public void mergeTwoLists() {
       TestUtils.PrintLink (new Offer25MergeLink().mergeTwoLists(TestUtils.getListLink(new int[]{1,2,4}),TestUtils.getListLink(new int[]{1,3,4})));
    }
}