package patterns.behavior.mediator;

public abstract class Customer {
    public String name;

    protected Customer(String name) {
        this.name = name;
    }

    public abstract void send(String info);
    public abstract void receive(String from, String info);
}
