package hard;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Offer19RegexTest {

    @Test
    public void isMatch() {
        Assert.assertTrue(new Offer19Regex().isMatch("bbbba",".*a*a"));
        Assert.assertFalse(new Offer19Regex().isMatch("aa","a"));
        Assert.assertTrue(new Offer19Regex().isMatch("aa","a*"));
        Assert.assertTrue(new Offer19Regex().isMatch("ab",".*"));
        Assert.assertFalse(new Offer19Regex().isMatch("ab",".*c"));
        Assert.assertTrue(new Offer19Regex().isMatch("aab","c*a*b"));
        Assert.assertTrue(new Offer19Regex().isMatch("aaa","a*a"));
        Assert.assertFalse(new Offer19Regex().isMatch("aaa","aaaa"));
        Assert.assertFalse(new Offer19Regex().isMatch("mississippi","mis*is*p*."));
    }
}