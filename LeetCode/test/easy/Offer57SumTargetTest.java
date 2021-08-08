package easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Offer57SumTargetTest {

    @Test
    public void findContinuousSequence() {
        System.out.println(Arrays.deepToString(new Offer57SumTarget().findContinuousSequence(9)));
        System.out.println(Arrays.deepToString(new Offer57SumTarget().findContinuousSequence(15)));
    }
}