package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class Offer58ReverseWordsTest {

    @Test
    public void reverseWords() {
        System.out.println(new Offer58ReverseWords().reverseWords("the sky is blue"));
        System.out.println(new Offer58ReverseWords().reverseWords("  hello world!  "));
    }

    @Test
    public void reverseLeftWords() {
        System.out.println(new Offer58ReverseWords().reverseLeftWords("abcdefg", 2));
        System.out.println(new Offer58ReverseWords().reverseLeftWords("lrloseumgh", 6));
    }
}