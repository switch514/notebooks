package normal;

import org.junit.Test;

import static org.junit.Assert.*;

public class Offer67StrToIntTest {

    @Test
    public void strToInt() {
        System.out.println(new Offer67StrToInt().strToInt("42"));
        System.out.println(new Offer67StrToInt().strToInt("   -42"));
        System.out.println(new Offer67StrToInt().strToInt("4193 wwa"));
        System.out.println(new Offer67StrToInt().strToInt("wwa 1123"));
        System.out.println(new Offer67StrToInt().strToInt("-91283472332"));
    }
}