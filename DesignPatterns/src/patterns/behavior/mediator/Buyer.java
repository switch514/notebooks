package patterns.behavior.mediator;

public class Buyer extends Customer {
    protected Buyer(String name) {
        super(name);
    }

    @Override
    public void send(String info) {
        HouseMediator.getInstance().relay(this,this.name, info);
    }

    @Override
    public void receive(String from, String info) {
        System.out.println(name + " receive house info from " + from + " :" + info);
    }
}
