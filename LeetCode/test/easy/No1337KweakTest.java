package easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class No1337KweakTest {

    @Test
    public void kWeakestRows() {
        int [][] data = new int[][]{{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        System.out.println(Arrays.toString(new No1337Kweak().kWeakestRows(data, 3)));
    }
}