package patterns.creational.factory.abs;

public class AbsFactory2 implements AbsFactory{
    @Override
    public AbsProductX getProductX() {
        return new AbsProductX2();
    }

    @Override
    public AbsProductY getProductY() {
        return new AbsProductY2();
    }
}
