package normal;

import org.junit.Test;

import static org.junit.Assert.*;

public class No3SubStringLengthTest {

    @Test
    public void lengthOfLongestSubstring() {
        System.out.println(new No3SubStringLength().lengthOfLongestSubstring("dvdf"));
        System.out.println(new No3SubStringLength().lengthOfLongestSubstring("abcabcbb"));
        System.out.println(new No3SubStringLength().lengthOfLongestSubstring("bbbbb"));
        System.out.println(new No3SubStringLength().lengthOfLongestSubstring("pwwkew"));
        System.out.println(new No3SubStringLength().lengthOfLongestSubstring(""));
    }
}