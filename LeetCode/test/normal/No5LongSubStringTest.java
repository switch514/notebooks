package normal;

import org.junit.Test;

import static org.junit.Assert.*;

public class No5LongSubStringTest {

    @Test
    public void longestPalindrome() {
        System.out.println(new No5LongSubString().longestPalindrome("babad"));
        System.out.println(new No5LongSubString().longestPalindrome("cbbd"));
        System.out.println(new No5LongSubString().longestPalindrome("bb"));
        System.out.println(new No5LongSubString().longestPalindrome("ccc"));
    }
}