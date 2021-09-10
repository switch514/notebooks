package normal;

import org.junit.Test;

import static org.junit.Assert.*;

public class Offer47MaxValueTest {

    @Test
    public void maxValue() {
        System.out.println(new Offer47MaxValue().maxValue(new int[][]{{1,2,5},{3,2,1}}));
        System.out.println(new Offer47MaxValue().maxValue(new int[][]{{1,3,1},{1,5,1},{4,2,1}}));
    }
}