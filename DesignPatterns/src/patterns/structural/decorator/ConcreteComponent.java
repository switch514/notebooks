package patterns.structural.decorator;

public class ConcreteComponent implements IComponent {
    @Override
    public void operation() {
        System.out.println("Call component function");
    }
}
