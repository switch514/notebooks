package patterns.behavior.mediator;

public class Seller extends Customer {
    protected Seller(String name) {
        super(name);
    }

    @Override
    public void send(String info) {
        HouseMediator.getInstance().relay(this, this.name, info);
    }

    @Override
    public void receive(String from, String info) {
        System.out.println(name + " receive message from " + from + " :" + info);
    }


}
