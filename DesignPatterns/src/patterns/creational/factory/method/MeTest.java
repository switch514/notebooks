package patterns.creational.factory.method;

public class MeTest {
    public static void main(String args[]){
        MeProduct mp = new MeFactoryA().getProduct();
        mp.use();
        mp = new MeFactoryB().getProduct();
        mp.use();
    }
}
