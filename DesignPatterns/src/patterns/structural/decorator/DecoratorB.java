package patterns.structural.decorator;

public class DecoratorB extends AbstractDecorator{
    public DecoratorB(IComponent component) {
        super(component);
    }

    public void extOperationB(){
        System.out.println("Call extra operation B");
    }
}
