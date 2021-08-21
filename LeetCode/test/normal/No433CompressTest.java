package normal;

import org.junit.Test;

import static org.junit.Assert.*;

public class No433CompressTest {

    @Test
    public void compress() {
        System.out.println(new No433Compress().compress(new char[]{'a','a','b','b','c','c','c'}));
        System.out.println(new No433Compress().compress(new char[]{'a'}));
        System.out.println(new No433Compress().compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}));
    }
}