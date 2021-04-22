package patterns.creational.factory.method;

public class MeFactoryA implements MeFactory{
    @Override
    public MeProduct getProduct() {
        return new MeProductA();
    }
}
