package patterns.structural.proxy;

public class RealSubject implements ISubject{
    @Override
    public void operation() {
        System.out.println("RealSubject visited.");
    }

    @Override
    public void operation2() {
        System.out.println("RealSubject2 visited.");
    }
}
