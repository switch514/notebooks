package patterns.structural.composite.safe;

public class LeafSafe implements IComponentSafe {
    private String name;
    public LeafSafe(String name) {
        this.name=name;
    }
    @Override
    public void operation() {
        System.out.println("Leaf visited " +name);
    }
}
