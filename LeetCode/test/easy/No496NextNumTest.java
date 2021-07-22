package easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class No496NextNumTest {

    @Test
    public void nextGreaterElement() {
        System.out.println(Arrays.toString(new No496NextNum().nextGreaterElement(new int[]{4,1,2},new int[]{1,3,4,2})));
        System.out.println(Arrays.toString(new No496NextNum().nextGreaterElement(new int[]{2,4},new int[]{1,2,3,4})));
    }
}