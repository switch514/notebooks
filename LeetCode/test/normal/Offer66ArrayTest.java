package normal;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Offer66ArrayTest {

    @Test
    public void constructArr() {
        System.out.println(Arrays.toString(new Offer66Array().constructArr(new int[]{1,2,3,4,5})));
    }
}