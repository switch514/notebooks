package easy;

import org.junit.Test;

import static org.junit.Assert.*;

public class No263UglyTest {

    @Test
    public void isUgly() {
        System.out.println(new No263Ugly().isUgly(6));
        System.out.println(new No263Ugly().isUgly(8));
        System.out.println(new No263Ugly().isUgly(14));
        System.out.println(new No263Ugly().isUgly(1));
    }

    @Test
    public void nthUglyNumber() {
        System.out.println(new No263Ugly().nthUglyNumber2(4));
        System.out.println(new No263Ugly().nthUglyNumber2(10));
        System.out.println(new No263Ugly().nthUglyNumber2(1));
    }


    @Test
    public void nthSuperUglyNumber(){
        System.out.println(new No263Ugly().nthSuperUglyNumber(12, new int[]{2,7,13,19}));
        System.out.println(new No263Ugly().nthSuperUglyNumber(1, new int[]{2,3,5}));

    }
}