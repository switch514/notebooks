package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class No0102StrCheckTest {

    @Test
    public void checkPermutation() {
        System.out.println(new No0102StrCheck().CheckPermutation("abc","acd"));
        System.out.println(new No0102StrCheck().CheckPermutation("abc","acb"));
    }
}