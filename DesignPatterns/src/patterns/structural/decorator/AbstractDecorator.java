package patterns.structural.decorator;


public abstract class AbstractDecorator implements IComponent {
    private IComponent component;

    public AbstractDecorator(IComponent component){
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}
