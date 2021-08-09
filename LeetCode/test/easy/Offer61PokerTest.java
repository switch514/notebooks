package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class Offer61PokerTest {

    @Test
    public void isStraight() {
        System.out.println(new Offer61Poker().isStraight(new int []{1,2,3,4,5}));
        System.out.println(new Offer61Poker().isStraight(new int []{0,0,1,2,5}));
        System.out.println(new Offer61Poker().isStraight(new int []{0,0,1,2,6}));
    }
}