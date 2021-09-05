package hard;

import org.junit.Test;

import static org.junit.Assert.*;

public class Offer41MidTest {

    @Test
    public void findMedian() {
        Offer41Mid mid = new Offer41Mid();

        mid.addNum(-1);
        mid.addNum(-2);
        System.out.println(mid.findMedian());
        mid.addNum(-3);
        System.out.println(mid.findMedian());
        mid.addNum(-4);
        System.out.println(mid.findMedian());
        mid.addNum(-5);
        System.out.println(mid.findMedian());
    }
}