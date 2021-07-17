package hard;
import hard.No218SkyLine;
import org.junit.Assert;
import org.junit.Test;

public class No218SkyLineTest {

    @Test
    public void testGetSkyline() throws Exception {
        int[][] buildings = new int[][]{{2, 9, 10}, {3, 7, 15}, {5, 12, 12}, {15, 20, 10}, {19, 24, 8}};
        int[][] buildings5 = new int[][]{{0, 3, 3}, {1, 5, 3}, {2, 4, 3}, {3, 7, 3}};
        int[][] buildings2 = new int[][]{{0, 2, 3}, {2, 5, 3}};
        int[][] buildings7 = new int[][]{{3, 7, 8}, {3, 9, 6}};
        int[][] buildings3 = new int[][]{{2, 9, 10}, {9, 12, 15}};
        int[][] buildings4 = new int[][]{{1, 2, 1}, {1, 2, 2}, {1, 2, 3}};
        int[][] buildings6 = new int[][]{{1, 5, 3}, {1, 5, 3}, {1, 5, 3}};
        int[][] buildings8 = new int[][]{{0, 5, 7}, {5, 10, 7}, {5, 10, 12},{10, 15, 7}};
        No218SkyLine skyLine = new No218SkyLine();

        Assert.assertEquals("[[2, 10], [3, 15], [7, 12], [12, 0], [15, 10], [20, 8], [24, 0]]",skyLine.getSkyline(buildings).toString());
        Assert.assertEquals("[[0, 3], [5, 0]]",skyLine.getSkyline(buildings2).toString());
        Assert.assertEquals("[[2, 10], [9, 15], [12, 0]]",skyLine.getSkyline(buildings3).toString());
        Assert.assertEquals("[[1, 3], [2, 0]]",skyLine.getSkyline(buildings4).toString());
        Assert.assertEquals("[[1, 3], [5, 0]]",skyLine.getSkyline(buildings6).toString());
        Assert.assertEquals("[[3, 8], [7, 6], [9, 0]]",skyLine.getSkyline(buildings7).toString());
        Assert.assertEquals("[[0, 7], [5, 12], [10, 7], [15, 0]]",skyLine.getSkyline(buildings8).toString());
    }
}