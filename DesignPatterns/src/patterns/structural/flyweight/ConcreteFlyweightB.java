package patterns.structural.flyweight;

public class ConcreteFlyweightB implements IFlyweight{
    @Override
    public void operation(UnsharedState state) {
        System.out.println("Show black chess at "+state.getInfo());
    }
}
