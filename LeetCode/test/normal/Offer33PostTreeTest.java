package normal;

import org.junit.Test;

import static org.junit.Assert.*;

public class Offer33PostTreeTest {

    @Test
    public void verifyPostorder() {
        System.out.println(new Offer33PostTree().verifyPostorder(new int[]{1,2,3,4,5}));
        System.out.println(new Offer33PostTree().verifyPostorder(new int[]{1,6,3,2,5}));
        System.out.println(new Offer33PostTree().verifyPostorder(new int[]{1,3,2,6,5}));
    }
}