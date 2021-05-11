package patterns.structural.decorator;

public class DecoratorTest {
    public static void main(String [] args){
        DecoratorA a = new DecoratorA(new ConcreteComponent());
        a.operation();
        a.extOperationA();

        DecoratorB b = new DecoratorB(new ConcreteComponent());
        b.operation();
        b.extOperationB();
    }
}
