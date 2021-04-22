package patterns.creational.builder;

public abstract class Cooker {
    public abstract String getDrink();
    public abstract String getMainDish();
    public abstract String getSweet();

    public Meal getMeal() {
        Meal meal = new Meal();
        meal.setDrink(getDrink());
        meal.setFood(getMainDish());
        meal.setSweet(getSweet());
        return meal;
    }
}
