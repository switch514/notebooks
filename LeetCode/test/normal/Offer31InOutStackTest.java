package normal;

import org.junit.Test;

import static org.junit.Assert.*;

public class Offer31InOutStackTest {

    @Test
    public void validateStackSequences() {
        System.out.println(new Offer31InOutStack().validateStackSequences(new int []{1,2,3,4,5}, new int[]{4,5,3,2,1}));
        System.out.println(new Offer31InOutStack().validateStackSequences(new int []{1,2,3,4,5}, new int[]{4,3,5,1,2}));
    }
}