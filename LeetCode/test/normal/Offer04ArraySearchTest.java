package normal;

import org.junit.Test;

import static org.junit.Assert.*;

public class Offer04ArraySearchTest {

    @Test
    public void findNumberIn2DArray() {
        int[][] data = new int[][]{
                {1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
        System.out.println(new Offer04ArraySearch().findNumberIn2DArray(data, 5));
        System.out.println(new Offer04ArraySearch().findNumberIn2DArray(data, 20));
    }
}