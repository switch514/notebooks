package patterns.structural.decorator;

public class DecoratorA extends AbstractDecorator{
    public DecoratorA(IComponent component) {
        super(component);
    }

    public void extOperationA(){
        System.out.println("call extra operation A");
    }
}
