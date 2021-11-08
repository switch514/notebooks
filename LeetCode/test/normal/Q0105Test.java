package normal;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q0105Test {

    @Test
    public void oneEditAway() {
        System.out.println(new Q0105().oneEditAway("cb","ab"));
        System.out.println(new Q0105().oneEditAway("","a"));
        System.out.println(new Q0105().oneEditAway("pales","pal"));
    }
}