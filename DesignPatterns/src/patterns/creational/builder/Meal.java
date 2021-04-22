package patterns.creational.builder;

public class Meal {
    private String food;
    private String drink;
    private String sweet;

    public void eat(){
        System.out.println("eat " + food);
        System.out.println("drink " + drink);
        System.out.println("enjoy " + sweet);
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public String getSweet() {
        return sweet;
    }

    public void setSweet(String sweet) {
        this.sweet = sweet;
    }
}
