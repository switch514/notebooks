package normal;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Offer56CountsTest {

    @Test
    public void singleNumbers() {
        System.out.println(Arrays.toString(new Offer56Counts().singleNumbers3(new int[]{4,1,4,6})));
        System.out.println(Arrays.toString(new Offer56Counts().singleNumbers3(new int[]{1,2,10,4,1,4,3,3})));
    }
}