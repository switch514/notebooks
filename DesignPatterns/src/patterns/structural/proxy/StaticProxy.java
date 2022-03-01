package patterns.structural.proxy;

public class StaticProxy implements ISubject {
    private final ISubject subject;

    public StaticProxy(ISubject subject) {
        this.subject = subject;
    }

    public void preOperation() {
        System.out.println("pre operation visited.");
    }

    @Override
    public void operation() {
        subject.operation();
    }

    @Override
    public void operation2() {

    }

    public void afterOperation() {
        System.out.println("after operation visited.");
    }
}
