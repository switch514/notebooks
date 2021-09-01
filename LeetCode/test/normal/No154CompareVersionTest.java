package normal;

import org.junit.Assert;
import org.junit.Test;

public class No154CompareVersionTest {

    @Test
    public void compareVersion() {
        Assert.assertEquals(0, new No154CompareVersion().compareVersion("1.01", "1.001"));
        Assert.assertEquals(0, new No154CompareVersion().compareVersion("1.0", "1.0.0"));
        Assert.assertEquals(-1, new No154CompareVersion().compareVersion("0.1", "1.1"));
        Assert.assertEquals(1, new No154CompareVersion().compareVersion("1.0.1", "1"));
        Assert.assertEquals(-1, new No154CompareVersion().compareVersion("7.5.2.4", "7.5.3"));
        Assert.assertEquals(-1, new No154CompareVersion().compareVersion("1", "1.1"));
    }
}