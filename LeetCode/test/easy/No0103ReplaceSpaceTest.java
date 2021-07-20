package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class No0103ReplaceSpaceTest {

    @Test
    public void replaceSpaces() {
        System.out.println(new No0103ReplaceSpace().replaceSpaces("Mr John Smith    ",13));
        System.out.println(new No0103ReplaceSpace().replaceSpaces("               ",5));
    }
}