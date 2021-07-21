package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class Offer50FirstCharacterTest {

    @Test
    public void firstUniqChar() {
        System.out.println(new Offer50FirstCharacter().firstUniqChar("abaccdeff"));
        System.out.println(new Offer50FirstCharacter().firstUniqChar("leetcode"));
    }
}