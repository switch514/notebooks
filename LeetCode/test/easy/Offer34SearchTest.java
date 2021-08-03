package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class Offer34SearchTest {

    @Test
    public void searchBin() {
        System.out.println(new Offer34Search().searchBin(new int[]{5,7,7,8,8,10}, 8));
        System.out.println(new Offer34Search().searchBin(new int[]{1,2,3}, 1));
        System.out.println(new Offer34Search().searchBin(new int[]{1}, 1));
        System.out.println(new Offer34Search().searchBin(new int[]{5,7,7,8,8,10}, 6));
    }
}