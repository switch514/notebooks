package patterns.structural.composite.clear;

public class LeafClear implements IComponentClear {
    private final String name;

    public LeafClear(String name) {
        this.name = name;
    }

    @Override
    public void add(IComponentClear com) {

    }

    @Override
    public void remove(IComponentClear com) {

    }

    @Override
    public IComponentClear getChild(int i) {
        return null;
    }

    @Override
    public void operation() {
        System.out.println("Leaf reached" + name);
    }
}
