package patterns.structural.proxy;

public class Proxy implements ISubject {
    private final ISubject subject;

    public Proxy(ISubject subject) {
        this.subject = subject;
    }

    public void preOperation() {
        System.out.println("pre operation visited.");
    }

    @Override
    public void operation() {
        subject.operation();
    }

    public void afterOperation() {
        System.out.println("after operation visited.");
    }
}
