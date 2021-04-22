package patterns.creational.factory.simple;

import patterns.common.PatternException;

public class SipTest {
    public static void main(String args[]) throws PatternException {
        SipProduct sp = SipFactory.getProduct("A");
        sp.use();
        sp=SipFactory.getProduct("B");
        sp.use();
    }
}
