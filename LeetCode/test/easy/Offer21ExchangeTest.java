package easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Offer21ExchangeTest {

    @Test
    public void exchange() {
        System.out.println(Arrays.toString(new Offer21Exchange().exchange(new int []{1,2,3,4,5})));
        System.out.println(Arrays.toString(new Offer21Exchange().exchange(new int []{1,3,5})));
    }
}