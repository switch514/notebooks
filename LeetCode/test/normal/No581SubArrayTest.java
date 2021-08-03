package normal;

import org.junit.Test;

import static org.junit.Assert.*;

public class No581SubArrayTest {

    @Test
    public void findUnsortedSubarray() {
        System.out.println(new No581SubArray().findUnsortedSubarray(new int[] {5,4,3,2,1}));
        System.out.println(new No581SubArray().findUnsortedSubarray(new int[] {2,6,4,8,10,9,15}));
        System.out.println(new No581SubArray().findUnsortedSubarray(new int[] {1,2,3,4}));
        System.out.println(new No581SubArray().findUnsortedSubarray(new int[] {1}));
    }
}