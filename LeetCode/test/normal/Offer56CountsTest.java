package normal;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Offer56CountsTest {

    @Test
    public void singleNumbers() {
        System.out.println(new Offer56Counts().singleNumberII(new int[]{9,1,7,9,7,9,7}));
        //System.out.println(Arrays.toString(new Offer56Counts().singleNumbers3(new int[]{1,2,10,4,1,4,3,3})));
    }
}