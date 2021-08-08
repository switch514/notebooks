package easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Offer57TwoSumTest {

    @Test
    public void twoSum() {
        System.out.println(Arrays.toString(new Offer57TwoSum().twoSum(new int [] {2,7,11,15} ,9)));
        System.out.println(Arrays.toString(new Offer57TwoSum().twoSum(new int [] {10,26,30,31,47,60} ,40)));
    }
}