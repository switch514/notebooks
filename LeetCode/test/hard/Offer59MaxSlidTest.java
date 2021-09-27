package hard;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Offer59MaxSlidTest {

    @Test
    public void maxSlidingWindow() {
        System.out.println(Arrays.toString(new Offer59MaxSlid().maxSlidingWindow(new int[]{1,3,1,2,0,5},3)));
        System.out.println(Arrays.toString(new Offer59MaxSlid().maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3)));
    }
}