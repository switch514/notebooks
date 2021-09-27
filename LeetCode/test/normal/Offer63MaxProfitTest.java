package normal;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Offer63MaxProfitTest {

    @Test
    public void maxProfit() {
        System.out.println(new Offer63MaxProfit().maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(new Offer63MaxProfit().maxProfit(new int[]{7,6,4,3,1}));
    }
}