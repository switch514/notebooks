package easy;

import easy.No1ArraySum;
import org.junit.Assert;
import org.junit.Test;

public class No1ArraySumTest {

    @Test
    public void twoSum() {
        int [] testNums = new int[] {2,7,11,15};
        int [] result = No1ArraySum.twoSum(testNums,9);
        Assert.assertTrue((result[0]==0 && result[1]==1) ||(result[0]==1 && result[1]==0));
    }
}