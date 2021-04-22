package patterns.creational.builder;

import patterns.common.PatternException;

public class BuilderTest {
    public static void main(String args[]) throws PatternException {
        Waiter.getMeal("A").eat();
        Waiter.getMeal("b").eat();
    }
}
