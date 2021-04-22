package patterns.creational.factory.method;

public class MeFactoryB implements MeFactory{
    @Override
    public MeProduct getProduct() {
        return new MeProductB();
    }
}
