package patterns.creational.factory.abs;

public class AbsTest {
    public static void main(String args[]) {
    new AbsFactory1().getProductX().use();
    new AbsFactory1().getProductY().play();

    new AbsFactory2().getProductX().use();
    new AbsFactory2().getProductY().play();
}
}
