package easy;

import common.TestUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class Offer06ReverseLinkTest {

    @Test
    public void reversePrint() {
        new Offer06ReverseLink().reversePrint(TestUtils.getListLink(new int[]{1,3,2}));
    }
}