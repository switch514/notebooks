package patterns.creational.builder;

import patterns.common.PatternException;

public class Waiter {
    public static Meal getMeal(String mealName) throws PatternException {
        if(mealName.equalsIgnoreCase("A")){
            return new CookerA().getMeal();
        }
        if(mealName.equalsIgnoreCase("B")){
            return new CookerB().getMeal();
        }
        throw new PatternException("unsupported meal");
    }
}
