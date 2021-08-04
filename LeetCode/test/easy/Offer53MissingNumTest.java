package easy;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Offer53MissingNumTest {

    @Test
    public void missingNumber() {
        Assert.assertEquals(8, new Offer53MissingNum().missingNumber2(new int []{0,1,2,3,4,5,6,7,9}));
        Assert.assertEquals(2, new Offer53MissingNum().missingNumber2(new int []{0,1}));
        Assert.assertEquals(1, new Offer53MissingNum().missingNumber2(new int []{0}));
        Assert.assertEquals(3, new Offer53MissingNum().missingNumber2(new int []{0,1,2,4}));
        Assert.assertEquals(0, new Offer53MissingNum().missingNumber2(new int []{1}));
    }
}