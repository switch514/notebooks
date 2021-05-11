package patterns.structural.adapter;

public class MultiDirectionAdapter implements IOriginalInterface, ITargetInterface {
    private Adaptee adaptee = new Adaptee();
    private ObjectAdapter target = new ObjectAdapter();

    @Override
    public void requestOriginal() {
        adaptee.requestOriginal();
    }

    @Override
    public void requestTarget() {
        target.requestTarget();
    }
}
