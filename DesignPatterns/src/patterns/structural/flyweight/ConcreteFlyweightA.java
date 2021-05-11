package patterns.structural.flyweight;

public class ConcreteFlyweightA implements IFlyweight{
    @Override
    public void operation(UnsharedState state) {
        System.out.println("Show white chess at "+state.getInfo());
    }
}
