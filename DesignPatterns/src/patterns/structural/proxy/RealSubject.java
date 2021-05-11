package patterns.structural.proxy;

public class RealSubject implements ISubject{
    @Override
    public void operation() {
        System.out.println("RealSubject visited.");
    }
}
