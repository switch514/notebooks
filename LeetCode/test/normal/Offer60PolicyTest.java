package normal;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Offer60PolicyTest {

    @Test
    public void dicesProbability() {
        System.out.println(Arrays.toString(new Offer60Policy().dicesProbability(2)));
    }
}