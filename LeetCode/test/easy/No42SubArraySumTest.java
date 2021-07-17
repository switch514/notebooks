package easy;

import easy.No42SubArraySum;
import org.junit.Assert;
import org.junit.Test;

public class No42SubArraySumTest {



    @Test
    public void maxSubArray() {
        int [] array = new int[]{-2,1,-3,4,-1,2,1,-5,4};

        Assert.assertEquals(6, No42SubArraySum.maxSubArray(array));
    }
}