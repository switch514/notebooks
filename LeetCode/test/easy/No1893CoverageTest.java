package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class No1893CoverageTest {

    @Test
    public void isCovered() {
        int [][] data = new int[][]{{1,50}};
        System.out.println(new No1893Coverage().isCovered(data,1,50));
    }
}