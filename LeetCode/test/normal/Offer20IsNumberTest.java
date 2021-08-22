package normal;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Offer20IsNumberTest {

    @Test
    public void isNumber() {
        Assert.assertTrue(new Offer20IsNumber().isNumber("+100"));
        Assert.assertTrue(new Offer20IsNumber().isNumber("+5E2"));
        Assert.assertTrue(new Offer20IsNumber().isNumber("-123"));
        Assert.assertTrue(new Offer20IsNumber().isNumber("3.1241"));
        Assert.assertTrue(new Offer20IsNumber().isNumber("-1E-16"));
        Assert.assertFalse(new Offer20IsNumber().isNumber("12e"));
        Assert.assertFalse(new Offer20IsNumber().isNumber("1a3.1241"));
        Assert.assertFalse(new Offer20IsNumber().isNumber("12.3.1"));
        Assert.assertFalse(new Offer20IsNumber().isNumber("+-1"));
        Assert.assertFalse(new Offer20IsNumber().isNumber("123e+41.1"));
        Assert.assertFalse(new Offer20IsNumber().isNumber("  "));
        Assert.assertFalse(new Offer20IsNumber().isNumber("e9"));
        Assert.assertTrue(new Offer20IsNumber().isNumber(".1"));
    }
}