package patterns.creational.factory.abs;

public class AbsFactory1 implements AbsFactory{
    @Override
    public AbsProductX getProductX() {
        return new AbsProductX1();
    }

    @Override
    public AbsProductY getProductY() {
        return new AbsProductY1();
    }
}
