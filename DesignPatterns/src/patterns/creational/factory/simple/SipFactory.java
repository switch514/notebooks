package patterns.creational.factory.simple;

import patterns.common.PatternException;

public class SipFactory {
    public static SipProduct getProduct(String type) throws PatternException {
        if(type.equalsIgnoreCase("A")){
            return new SipProductA();
        }
        if(type.equalsIgnoreCase("B")){
            return new SipProductB();
        }
        throw new PatternException("unknown type");
    }
}
