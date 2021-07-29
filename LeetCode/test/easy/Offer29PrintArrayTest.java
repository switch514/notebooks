package easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Offer29PrintArrayTest {

    @Test
    public void spiralOrder() {
        int[][] data1 = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] data2 = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(Arrays.toString(new Offer29PrintArray().spiralOrder(data1)));
        System.out.println(Arrays.toString(new Offer29PrintArray().spiralOrder(data2)));
    }
}