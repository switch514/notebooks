package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class No414ThirdMaxTest {

    @Test
    public void thirdMax() {
        System.out.println(new No414ThirdMax().thirdMax(new int []{3,2,1}));
        System.out.println(new No414ThirdMax().thirdMax(new int []{1,2}));
        System.out.println(new No414ThirdMax().thirdMax(new int []{2,2,3,1}));
    }
}