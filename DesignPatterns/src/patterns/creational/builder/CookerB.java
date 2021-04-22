package patterns.creational.builder;

public class CookerA extends Cooker{
    @Override
    public String getDrink() {
        return "cola";
    }

    @Override
    public String getMainDish() {
        return "bugger";
    }

    @Override
    public String getSweet() {
        return "ice cream";
    }
}
