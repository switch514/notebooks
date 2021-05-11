package patterns.structural.adapter;

public class ObjectAdapter implements ITargetInterface {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void requestTarget() {
        System.out.println("Object adapter target called.");
        adaptee.requestOriginal();
    }
}
