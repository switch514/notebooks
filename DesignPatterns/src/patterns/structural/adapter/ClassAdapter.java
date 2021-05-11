package patterns.structural.adapter;

public class ClassAdapter extends Adaptee implements ITargetInterface {
    @Override
    public void requestTarget() {
        System.out.println("class adapter target called.");
        super.requestOriginal();
    }
}
