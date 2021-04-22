package patterns.creational.builder;

public class CookerB extends Cooker{
    @Override
    public String getDrink() {
        return "spirit";
    }

    @Override
    public String getMainDish() {
        return "rice";
    }

    @Override
    public String getSweet() {
        return "chocolate";
    }
}
